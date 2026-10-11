class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 0) return false;
        if(nums.length <= 2) return true;

        int inc = 1, dec = 1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] <= nums[i]){
                inc++;
            }
            if(nums[i-1] >= nums[i]){
               dec++;
            }
        }
        return inc == nums.length || dec == nums.length;
    }
}