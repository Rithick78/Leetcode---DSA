class Solution {

    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k % n;

        List<Integer> list = new ArrayList<>();

        // Last k elements
        for (int i = n - k; i < n; i++) {
            list.add(nums[i]);
        }

        // Remaining elements
        for (int j = 0; j < n - k; j++) {
            list.add(nums[j]);
        }
        for(int q=0;q<n;q++){
            nums[q] = list.get(q);
        }
    }
}