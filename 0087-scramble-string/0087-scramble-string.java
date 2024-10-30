class Solution {
        private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }

       
        if (s1.equals(s2)) {
            return true;
        }

       
        if (!isAnagram(s1, s2)) {
            return false;
        }

        return scrambleHelper(s1, s2);
    }

    
    private boolean scrambleHelper(String s1, String s2) {
      
        if (s1.equals(s2)) {
            return true;
        }

      
        String key = s1 + "," + s2;

    
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int n = s1.length();

        for (int i = 1; i < n; i++) {
        

            if (scrambleHelper(s1.substring(0, i), s2.substring(0, i)) &&
                scrambleHelper(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }

            
            if (scrambleHelper(s1.substring(0, i), s2.substring(n - i)) &&
                scrambleHelper(s1.substring(i), s2.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }


        memo.put(key, false);
        return false;
        
    }
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

}