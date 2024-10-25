class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        boolean neg = false;
        int index = 0;
        long ans = 0;

        // Check for sign at the beginning
        if (s.charAt(index) == '-') {
            neg = true;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Process the numeric part
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (ch < '0' || ch > '9') {
                break;
            }
            int dig = ch - '0';
            ans = ans * 10 + dig;

            if (!neg && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (neg && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        if (neg) {
            ans = -ans;
        }

        return (int) ans;
    }
}