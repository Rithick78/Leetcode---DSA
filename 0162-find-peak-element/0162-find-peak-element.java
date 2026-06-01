class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1, high = n -2;

         if(n == 1) return 0;
        if(nums[low] < nums[low-1]) return low-1;
        if(nums[high+1] > nums[high]) return high+1;

        while(low <= high){
            if(nums[low] > nums[low+1] && nums[low] > nums[low-1]) return low;
            else low++;

            if(nums[high] > nums[high-1] && nums[high] > nums[high+1]) return high;
            else high--;
        }
        return -1;
    }
}