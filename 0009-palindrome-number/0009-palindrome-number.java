class Solution {
    public boolean isPalindrome(int x) {
        
        int dup = x;
        int revNum = 0;

        while (x > 0) {
            int q = x % 10;         
            revNum = (revNum * 10) + q;
            x = x / 10;
        }

        return dup == revNum;      
    }
}