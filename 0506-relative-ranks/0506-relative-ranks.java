class Solution {
    public String[] findRelativeRanks(int[] score) {

        int[] l = score.clone();

        Arrays.sort(l);

        Map<Integer, String> rankMap = new HashMap<>();
        
    
        int n = score.length;
        if (n >= 1) rankMap.put(l[n - 1], "Gold Medal");
        if (n >= 2) rankMap.put(l[n - 2], "Silver Medal");
        if (n >= 3) rankMap.put(l[n - 3], "Bronze Medal");

    
        for (int i = 4; i <= n; i++) {
            rankMap.put(l[n - i], String.valueOf(i));
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }
}