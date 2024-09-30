class Solution {
    public int characterReplacement(String s, int k) {
        //Len(l,r) - max(freq) <=k

        int left = 0, right = 0;
    
        int len = 0;
        int freq = 0;
        int[] chars = new int[26];
        int res = 0;

        while(left <= right && right < s.length()){
            chars[s.charAt(right) - 'A']++;
            len = right - left + 1;
            for(int i = 0; i < 26; i++){
                freq = Math.max(freq, chars[i]);
            }
            if(len - freq > k ){
                chars[s.charAt(left) - 'A']--;
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}