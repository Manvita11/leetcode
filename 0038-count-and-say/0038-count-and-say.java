public class Solution {
    public String countAndSay(int n) {
        String[] result = new String[n];
        result[0] = "1";
        for (int i = 1; i < n; i++) {

            result[i] = countAndSayOutput(result[i - 1].toCharArray());
        }

        return result[n - 1];
    }


    private String countAndSayOutput(char[] s) {
        int count = 1;
        char c = s[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length; i++) {
 
            if (s[i] == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s[i];
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}