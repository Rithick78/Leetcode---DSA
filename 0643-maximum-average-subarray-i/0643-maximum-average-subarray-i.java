class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int curSum = 0;
         int maxSum = 0;

         for(int i=0;i<k;i++){
            curSum += nums[i];
         }

         maxSum = curSum;

         for(int i=k;i<nums.length;i++){
             curSum += nums[i] - nums[i-k];
             maxSum = Math.max(curSum, maxSum);
         }

         return (double) maxSum/k;
    }
}