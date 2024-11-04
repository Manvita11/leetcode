class Solution {
    public int reverse(int x) 
    {
        long reverseNumber=0;
       

        while(x != 0)
        {
            reverseNumber = (reverseNumber*10) + (x%10);
            x = x/10;
        }

       
        if(reverseNumber >= Integer.MIN_VALUE && reverseNumber <= Integer.MAX_VALUE)
        return (int)reverseNumber;
        else return 0;
        
    }
}