import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        char th[] = t.toCharArray();
        
        char sh[] = s.toCharArray();
        
        Arrays.sort(th);
        Arrays.sort(sh);
        
        if(Arrays.equals(sh,th)){
            return true;
        }
        return false;
    }
}