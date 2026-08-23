class Solution {
    public boolean checkDivisibility(int n) {
        int sumVal = 0, proVal = 1;
        int dup = n;

        while(dup != 0){
            int q = dup % 10;
            
            sumVal += q;
            proVal *= q;

            dup /= 10;
        }

        return n % (sumVal + proVal) == 0;
    }
}