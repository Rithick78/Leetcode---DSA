class Solution {
    public boolean detectCapitalUse(String word) {
        int firstLetter = word.charAt(0);
        int n = word.length();
        String actualWord = word.substring(1,n);

        if(firstLetter == word.toUpperCase().charAt(0)){
            return actualWord.equals(word.toLowerCase().substring(1,n)) || actualWord.equals(word.toUpperCase().substring(1,n));
        }else{
            return actualWord.equals(word.toLowerCase().substring(1,n));
        }
    }
}