class Solution {
    public int distributeCandies(int[] c) {
       int max_candy = c.length/2;
       Set<Integer> set = new HashSet<>();
       for(int num : c){
           set.add(num);
       }
       return set.size() < max_candy ? set.size() : max_candy;
    }
}