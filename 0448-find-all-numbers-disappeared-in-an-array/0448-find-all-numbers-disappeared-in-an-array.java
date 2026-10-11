class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] set = new int[nums.length];
        
        for(int num : nums){
           set[num-1] = num;
        }
        
        List<Integer> li = new ArrayList();
        
        for(int i=0;i<set.length;i++){
            if(set[i] == 0){
                li.add(i+1);
            }
        }
        return li;
    }
}