class Solution {
    static HashMap <Integer, String> map = new HashMap<>();

    public static String roman(int tem, int i){
        int powOf5 = 5 *((int)Math.pow(10, i));
        int powOf10 = ((int)Math.pow(10, i));

        if (map.containsKey(tem)){
            return map.get(tem);
        }

        String s ="";
        if(powOf5 < tem){
            s+= map.get(powOf5); 
            tem-= powOf5; 
        }

        while (tem != 0) {
            s +=  map.get(powOf10);
            tem -= powOf10;
        }

        i=s.length()-1;
        String ans ="";
        while(i>=0){
            ans += s.charAt(i);
            i--;
        }
        return ans;
    }
    public String intToRoman(int num) {
        String s = "";
        int i=0, tem =0;
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "VI");
        map.put(9, "XI");
        map.put(40, "LX");
        map.put(90, "CX");
        map.put(400, "DC");
        map.put(900, "MC");

        while (num != 0) {
            tem = num%10;
            s+=roman((int)(tem*Math.pow(10, i)), i);
            num /= 10;
            i++;
        }

        i=s.length()-1;
        String ans ="";
        while(i>=0){
            ans += s.charAt(i);
            i--;
        }
        return ans;
    }
}