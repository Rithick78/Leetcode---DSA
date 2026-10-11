class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();

        int right = n;

        for(int i = 0;i < haystack.length(); i++){
            if(right <= haystack.length() && haystack.substring(i,right).equals(needle)){
                return i;
            }else{
                right++;
            }
        }

        return -1;
    }
}