class Solution {
    public int maxDepth(String s) {
         int depth = 0, maxDepth = 0;
        //Traverse the string
        for (char c : s.toCharArray()) {
            
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
        }
        return maxDepth;
    }
}