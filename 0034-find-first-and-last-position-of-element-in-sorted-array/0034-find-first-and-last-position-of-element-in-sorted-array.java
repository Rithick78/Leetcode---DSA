class Solution {
     private int lowerBound(int[] nums, int target, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int upperBound(int[] nums, int target, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int lb = lowerBound(nums, target, n);
        int ub = upperBound(nums, target, n) - 1;

        if (lb == n || nums[lb] != target)
            return new int[]{-1, -1};

        return new int[]{lb, ub};
    }
}