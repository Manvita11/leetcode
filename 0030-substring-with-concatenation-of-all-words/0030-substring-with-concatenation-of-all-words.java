

import com.sun.net.httpserver.Authenticator.Success;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        HashMap<String, Integer> wordsCnt = new HashMap<>();
        int wordLen = words[0].length();
        
        for (String each : words) {
            wordsCnt.put(each, wordsCnt.getOrDefault(each, 0) + 1);
        }

        int requiredCnt = words.length;
        
        for (int startIdx = 0; startIdx < wordLen; startIdx++) {
            HashMap<String, Integer> curCnt = new HashMap<>();
            int left = startIdx;      
            int suucessCnt = 0;
            for (int right = startIdx; right <= s.length() - wordLen; right += wordLen) {
                String cur = s.substring(right, right + wordLen);
                
                if (wordsCnt.containsKey(cur)) {
                    curCnt.put(cur, curCnt.getOrDefault(cur, 0) + 1);
                    suucessCnt++;
                    while (curCnt.get(cur) > wordsCnt.get(cur)) {
                        String leftString = s.substring(left, left + wordLen);
                        curCnt.put(leftString, curCnt.get(leftString) - 1);
                        suucessCnt--;
                        left += wordLen;
                    }
                    
                    if (suucessCnt == requiredCnt) {
                        res.add(left);
                        String leftWord = s.substring(left, left + wordLen);
                        curCnt.put(leftWord, curCnt.get(leftWord) - 1);
                        suucessCnt--;
                        left += wordLen;
                    }
                } else {
                    left = right + wordLen;
                    suucessCnt = 0;
                    curCnt.clear();
                }
            }

        }


        return res;

    }
}