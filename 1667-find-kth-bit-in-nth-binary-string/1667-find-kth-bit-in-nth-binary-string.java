class Solution {
    public char findKthBit(int n, int k) {
        int length=(int)Math.pow(2,n)-1;
       
        return find(n,k,length);
    }

    private char find(int n,int k,int length){
        if(k==1)
            return '0';

        int mid= (length+1)/2;
        if(k==mid)
            return '1';

        else if(k<mid){
            int len=(int)Math.pow(2,n-1)-1;
            return find(n-1,k,len);
        }
        
        else{
            int newK=length-k+1;
            int len=(int)Math.pow(2,n-1)-1;
           
            char ch= find(n-1,newK,len);
           
            return ch=='1'?'0':'1';
        }
    }
}