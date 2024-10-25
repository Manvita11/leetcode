class Solution {
    public int myAtoi(String s) {
        StringBuilder sb=new StringBuilder("");
        String s2=s.trim();
        if(s2.isEmpty()){
            return 0;
        }

        if(s2.length()>=2){
        char z=s2.charAt(0);
        char y=s2.charAt(1);
        if(!Character.isDigit(z)){
            if(!Character.isDigit(y)){
                return 0;
            }
        }
    }
    
    if(s2.length()==1){
        char x=s2.charAt(0);
        if(!Character.isDigit(x)){
            return 0;
        }
    }
        
        if(s2.charAt(0)=='-' || s2.charAt(0)=='+'){
            sb.append(s2.charAt(0));
            for(int i=1;i<s2.length();i++){
                if(i==1 && s2.charAt(i)=='0'){
                     
                }else{
                    if(Character.isDigit(s2.charAt(i))){
                        sb.append(s2.charAt(i));
                     }else{
                         break;
                     }  
                }
            }
            String str=sb.toString();
            if (str.equals("-") || str.isEmpty() ||str.equals("+")) {
               return 0;
            }
            try {
             long b = Long.parseLong(str); // Parses 'a' directly as a long
                // Check if 'b' is within the integer range
                if (b > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (b < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                return (int) b; 
              }catch (NumberFormatException e) {
    return str.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
            
        }else{
             for(int i=0;i<s2.length();i++){
            if(Character.isDigit(s2.charAt(i))){
                sb.append(s2.charAt(i));
            }else{
                break;
            }
        }
        String a=sb.toString();
        if(a.isEmpty()){
            return 0;
        }
        try {
           long b = Long.parseLong(a);
                 if (b > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (b < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                 return (int) b; 
            }catch (NumberFormatException e) {
    return a.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
        }   
}
}