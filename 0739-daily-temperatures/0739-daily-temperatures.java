class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temp.length; i++) {

            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            stack.push(i);
        }

        return ans;
    }
}