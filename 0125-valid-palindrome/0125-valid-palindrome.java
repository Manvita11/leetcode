class Solution {
    public boolean isPalindrome(String s) {
        String s1= new String();
        String s2= new String();
        Boolean result;
        if(s==null|| s.isEmpty())
        {
            return true;
        }
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if((c>='A' && c<='Z')||(c>='a' && c<='z')|| (c >= '0' && c <= '9') )
            {
                s1+=Character.toLowerCase(c);
            }
        }

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
       
           result=s1.equals(s2);
        
        return result;
    }
}