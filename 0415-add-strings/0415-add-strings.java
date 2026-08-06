class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length() - 1, m = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(n >= 0 || m >= 0 || carry > 0){
            int a = n >= 0 ? num1.charAt(n) - '0' : 0;
            int b = m >= 0 ? num2.charAt(m) - '0' : 0;

            int sum = a + b + carry;

            int val = sum % 10;
            carry = sum / 10;
            sb.append(val);
            n--;
            m--;
        }
        return sb.reverse().toString();

    }
}