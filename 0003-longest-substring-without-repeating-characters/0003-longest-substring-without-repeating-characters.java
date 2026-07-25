class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int minLen = 0;
        int left = 0;
        Set<Character> ch = new HashSet<>(256);

        for(int right=0;right<n;right++){
         
          while(ch.contains(s.charAt(right))){
             ch.remove(s.charAt(left));
             left++;
          }

          ch.add(s.charAt(right));
          minLen = Math.max(minLen, (right - left) + 1);

        }
        return minLen;
    }
}