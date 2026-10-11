class Solution {
    public int[] sortArrayByParity(int[] nums) {

        if(nums.length == 1 || nums.length == 0) return nums;
        
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] % 2 == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }
        return nums;
    }
}