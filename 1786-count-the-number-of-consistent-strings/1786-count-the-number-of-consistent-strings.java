class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         boolean[] isAllowed = new boolean[26];
        

        for (char ch : allowed.toCharArray()) {
            isAllowed[ch - 'a'] = true;
        }

        int ans = 0;

 
        for (String word : words) {
            boolean isConsistent = true;

            for (char ch : word.toCharArray()) {

                if (!isAllowed[ch - 'a']) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                ans++;
            }
        }

        return ans;
        
    }
}