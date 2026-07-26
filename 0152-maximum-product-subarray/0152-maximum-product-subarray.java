class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int j = n-1;
        int leftPro = 1, rightPro = 1;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
           
           if(leftPro == 0) leftPro = 1;
           if(rightPro == 0) rightPro = 1;
           
           leftPro = leftPro * nums[i];
           rightPro = rightPro * nums[j];
           max = Math.max(max,Math.max(leftPro,rightPro));
           j--;
        }
        return max;
    }
}