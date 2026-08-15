class Solution {
    public List<String> fizzBuzz(int n) {
      StringBuilder sb = new StringBuilder();
      List<String> res = new ArrayList<>();
      
      for(int j=0;j<n;j++){
          int i = j + 1;
          if(i % 3 == 0 && i % 5 == 0){
             sb.append("FizzBuzz");
          }
          else if(i % 3 == 0){
            sb.append("Fizz");
          }
           else if(i % 5 == 0){
            sb.append("Buzz");
          }
          else{
             sb.append(i);
          }
          res.add(sb.toString());
          sb.setLength(0);
      }
      return res;
    }
}