class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder str = new StringBuilder();
        char pre = chars[0];
        str.append(pre);
        if(n==1){
            return 1;
        }

        int cnt=0;
        for(int i=0; i<n; i++){
            char ch = chars[i];
            if(ch==pre){
                cnt++;
            }else{
                if(cnt>1){
                    str.append(cnt);
                    cnt=1;
                }
                str.append(ch);
            }
            pre = ch;
            if(i==n-1){
                if(cnt>1){
                    str.append(cnt);
                }
            }
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}