class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int curSum = 0;

        int low = 0, high = 0;

        while(high < nums.length){

            curSum += nums[high];

            while(curSum >= target){
                minLen = Math.min(minLen, (high - low) + 1);
                curSum -= nums[low];
                low++;
            }
            high++;
        }
       return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}