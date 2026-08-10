class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
             int absVal = nums[i] ;
             absVal *= absVal;
             nums[i] = absVal;
        }
        Arrays.sort(nums);

        return nums;
    }
}