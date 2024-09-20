class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length()==0)
       {
        return -1;
       } 
       else if(haystack.equals(needle))
       {
        return 0;
       }
       int len=needle.length();
       for(int i=0, j=len; j<=haystack.length();i++,j++)
       {
        String str=haystack.substring(i,j);
        if(str.equals(needle))
        return i;
       }
       return -1;
    }
}