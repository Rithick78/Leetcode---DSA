class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1 || nums.length == 0) return nums;
        int n = nums.length;
        int odd = 0, even = n-1;

        while(odd < even){
            while(odd < even && nums[odd] % 2 == 0){
                 odd++;
            };
            while(odd < even && nums[even] % 2 == 1){
                even--;
            };

            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
            odd++;
            even--;
        }
        return nums;
    }
}