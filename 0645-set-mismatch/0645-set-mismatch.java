class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[nums.length];
        int[] res = new int[2];
        for(int num : nums){
            if(ans[num - 1] != 0){
                res[0] = num;
            }
            ans[num - 1] = num;
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i] == 0){
                res[1] = i+1;
            }
        }

        return res;

    }
}