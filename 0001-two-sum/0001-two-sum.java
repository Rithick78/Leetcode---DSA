class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap();
        int n = nums.length;

        for(int i=0;i<n;i++){
            int otherNum = target - nums[i];

            if(mpp.containsKey(otherNum)){
                return new int[]{mpp.get(otherNum), i};
            }
            
            mpp.put(nums[i], i);

        }
        return new int[] {};
    }
}