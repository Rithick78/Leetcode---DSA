class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(char num : p.toCharArray()){
            pCount[num - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if(i >= p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if(Arrays.equals(sCount, pCount)){
                ans.add(i - p.length() + 1);
            }
        }
        return ans;
    }
}