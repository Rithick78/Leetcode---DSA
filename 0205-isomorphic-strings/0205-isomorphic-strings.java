class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character, Character> ms = new HashMap<>();
       Map<Character, Character> mt = new HashMap<>();
       if(s.length() != t.length()) return false;

       for(int i = 0;i < s.length();i++){
           char ch1 = s.charAt(i);
           char ch2 = t.charAt(i);

           if(ms.containsKey(ch1)){
              if(ms.get(ch1) != ch2) return false;
           }else{
              ms.put(ch1,ch2);
           }

           if(mt.containsKey(ch2)){
             if(mt.get(ch2) != ch1) return false;
           }else{
              mt.put(ch2,ch1);
           }
       }
       return true;
    }
}