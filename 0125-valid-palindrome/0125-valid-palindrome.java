class Solution {
    public boolean isPalindrome(String s) {
        
       ArrayList<Character> words = new  ArrayList<Character>(); 

       for(int i = 0 ; i < s.length() ; i++)
       {
         if((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') || (s.charAt(i) <= '9' && s.charAt(i) >= '0') ) 
            {
                if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a' || s.charAt(i) <= '9' && s.charAt(i) >= '0')
                {
                    words.add(s.charAt(i));
                }
                else 
                {
                    words.add((char)(s.charAt(i) + 32));
                }
            }
       }

       int start = 0 ;  
       int end = words.size() - 1 ; 

       while(start <= end) 
       {

            if(words.get(start) != words.get(end)) 
            {
                return false;
            }

            start++;
            end--;

       }
        
        return true;
    }
}