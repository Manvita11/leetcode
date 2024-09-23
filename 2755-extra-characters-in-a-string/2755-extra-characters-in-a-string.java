class Solution {
    public int minExtraChar(String s, String[] dictionary) {

        Set<String> wordSet = new HashSet<>();
        for (String word : dictionary) {
            wordSet.add(word);
        }

  
        int n = s.length();

        int[] mn = new int[n + 1];
        
     
        for (int i = 0; i <= n; i++) {
            mn[i] = Integer.MAX_VALUE;
        }
        
   
        mn[0] = 0;

        for (int i = 1; i <= n; i++) {
            
            mn[i] = mn[i - 1] + 1;


            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (wordSet.contains(substring)) {
                    mn[i] = Math.min(mn[i], mn[j]);
                }
            }
        }

        return mn[n];
    }
}