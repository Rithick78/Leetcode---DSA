class Solution {
    public String simplifyPath(String path) {

        String[] newPath = path.split("/");
        Stack<String> st = new Stack<>();

        for (String dir : newPath) {

            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            if (dir.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(dir);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();

        for (String dir : st) {
            sb.append("/");
            sb.append(dir);
        }

        return sb.toString();
    }
}