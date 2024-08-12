class Solution {
    public boolean isIsomorphic(String s, String t) {
           Map<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char  ch2 = t.charAt(i);
            if(!mp.containsKey(ch1)){
                if(!mp.containsValue(ch2)){
                    mp.put(ch1,ch2);
                }
                else{
                    return false;

                }
            }
            else{
                char ch = mp.get(ch1);
                if( ch != ch2){
                    return false;
                }
            }
        }
         return true;
    }
}