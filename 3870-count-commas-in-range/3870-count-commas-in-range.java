class Solution {
    public int countCommas(int n) {
       
       int commas = n - 999;

       return commas < 0 ? 0 : commas;
    }
}