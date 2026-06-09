class Solution {
    public boolean isValid(String s) {
       Stack<Character> ch = new Stack<>();
       if(s.length() == 1) return false;
       for(char c : s.toCharArray()){
          if(c == '(' || c == '{' || c == '['){
             ch.push(c);
          }else{
             if(ch.isEmpty()) return false;
             char top = ch.pop();
             if(c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '['){
                return false;
             }
          }
       }
       return ch.isEmpty();
    }
}