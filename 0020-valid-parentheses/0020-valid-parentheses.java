class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();

       for(int i=0;i<s.length(); i++){
           char c = s.charAt(i);

           if(c == ')' || c == '}' || c == ']'){
               if(st.isEmpty()){
                  return false;
               }
               if(c == ')' && st.pop() != '(' || c == '}' && st.pop() != '{' || c == ']' && st.pop() != '['){
                    return false;
               }
           }else{
               st.add(c);
           }
       }
       return st.isEmpty();
    }
}