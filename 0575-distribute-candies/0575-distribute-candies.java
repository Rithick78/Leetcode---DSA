class Solution {
    public int distributeCandies(int[] c) {
        Arrays.sort(c);
        int max_candy = c.length/2;
        int dif_candy = c[0];
        int count = 1;
        for(int i=1;i<c.length;i++){
           if(dif_candy != c[i]){
               dif_candy = c[i];
               count++;
           }
        }
        return count < max_candy ? count : max_candy;
    }
}