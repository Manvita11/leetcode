class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        int start=max,end=sum;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossbile(mid,arr,days)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public boolean isPossbile(int mid,int arr[],int days){
        int no_days=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                no_days++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        System.out.print(no_days+" ");
        return no_days<=days;
    }
}