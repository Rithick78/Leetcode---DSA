class Solution {
    public int missingNumber(int[] nums) {
        int[] set = new int[nums.length];
        for(int num : nums){
            if(num == 0) continue;
            set[num - 1] = num;
        }

        for(int i=0;i<set.length;i++){
            if(set[i] == 0) return i+1;
        }
       return 0;
    }
}