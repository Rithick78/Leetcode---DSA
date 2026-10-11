class Solution {
    public int pivotIndex(int[] nums) {
       int sum = 0;
       for(int n : nums){
          sum += n;
       }

       int right = 0;

       for(int i = 0;i < nums.length;i++){
           
           int left = sum - right - nums[i];

           if(left == right){
              return i;
           }

            right += nums[i];
        
       }
       return -1;
    }
}