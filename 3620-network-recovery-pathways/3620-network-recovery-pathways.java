import java.util.*;

class Solution {

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int maxCost = 0;

        for (int[] e : edges) {
            int u = e[0], v = e[1], cost = e[2];

            graph[u].add(new int[]{v, cost});
            indegree[v]++;
            maxCost = Math.max(maxCost, cost);
        }

        // Topological Sort (Kahn's Algorithm)
        List<Integer> topo = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            topo.add(u);

            for (int[] edge : graph[u]) {
                int v = edge[0];

                if (--indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        int low = 0, high = maxCost, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canReach(graph, topo, online, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(List<int[]>[] graph,
                             List<Integer> topo,
                             boolean[] online,
                             long k,
                             int minEdge) {

        int n = online.length;

        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);

        dp[0] = 0;

        for (int u : topo) {

            if (dp[u] == Long.MAX_VALUE) continue;

            for (int[] edge : graph[u]) {
                int v = edge[0];
                int cost = edge[1];

                if (cost < minEdge) continue;

                // Intermediate nodes must be online
                if (v != n - 1 && !online[v]) continue;

                dp[v] = Math.min(dp[v], dp[u] + cost);
            }
        }

        return dp[n - 1] <= k;
    }
}