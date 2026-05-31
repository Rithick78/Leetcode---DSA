class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        // count = [0, 0, 0, 0, 0, ...]
        int[] count = new int[26];

        // ['a', 'b', 'c']
        for (char c : s.toCharArray()) count[c - 'a']++; // [1, 2, 1, 0, 0, ...]

        for (char c : t.toCharArray()) count[c - 'a']--;
        
        for (int i : count) {
            if (i != 0) return false;
        }
        return true;
    }
}