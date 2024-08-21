class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length==threshold) return Arrays.stream(nums).max().getAsInt();
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int min=Integer.MIN_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int time=0;
            for(int i: nums){
                time += (i + mid - 1) / mid;
            }
            if(time<=threshold){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}