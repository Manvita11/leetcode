class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int i=len-1;

        while(i>=0){
            if(s.charAt(i) == ' '){
                i--;
                continue;
            }
            int j=i;
            if(i<0) break;
            
            while(i>=0 && s.charAt(i) !=' '){
               
                i--;
            }
            
            if(sb.isEmpty()){
                sb.append(s.substring(i+1,j+1));
            }else{
                sb.append(" ");
                sb.append(s.substring(i+1,j+1));
            }
                
        }
        return sb.toString();
    }
}