class Solution {
    public String intToRoman(int num) {
        int rem,src=0;
        StringBuilder roman=new StringBuilder();
        while(num>0){
            rem=num%10;
            num=num/10;
            if(src==0){
                if(rem==9){
                    roman.insert(0,"IX");
                    rem-=9;
                }
                else if(rem>=5){
                    roman.insert(0,"V");
                    rem-=5;
                }
                else if(rem==4){
                    roman.insert(0,"IV");
                    rem-=4;
                }
                while(rem!=0){
                    roman.insert(roman.length(),"I");
                    rem-=1;
                }
            }
            else if(src==1){
                if(rem==9){
                    roman.insert(0,"XC");
                    rem-=9;
                }
                else if(rem>=5){
                    roman.insert(0,"L");
                    rem-=5;
                    while(rem!=0){
                        roman.insert(1,"X");
                        rem-=1;
                    }
                }
                else if(rem==4){
                    roman.insert(0,"XL");
                    rem-=4;
                }
                while(rem!=0){
                    roman.insert(0,"X");
                    rem-=1;
                }
            }
            else if(src==2){
                if(rem==9){
                    roman.insert(0,"CM");
                    rem-=9;
                }
                else if(rem>=5){
                    roman.insert(0,"D");
                    rem-=5;
                    while(rem!=0){
                        roman.insert(1,"C");
                        rem-=1;
                    }
                }
                else if(rem==4){
                    roman.insert(0,"CD");
                    rem-=4;
                }
                while(rem!=0){
                    roman.insert(0,"C");
                    rem-=1;
                }
            }
            else{
                while(rem!=0){
                    roman.insert(0,"M");
                    rem-=1;
                }
            }
            src++;
        }
        return roman.toString();
    }
}