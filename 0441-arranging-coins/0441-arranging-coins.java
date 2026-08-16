class Solution {
    public int arrangeCoins(int n) {
       int sum = n;
       int i;
       for(i=1;i<=n;i++){
          sum = sum - i;
          if(sum <= -1){
            break;
          }
       }
       return i - 1;
    }
}