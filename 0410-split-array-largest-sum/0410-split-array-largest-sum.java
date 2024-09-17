class Solution {
    public int splitArray(int[] nums, int k) {
         int low = 0;
         int high = 0;
         for(int num:nums)
         {
            low  = Math.max(low,num);
            high += num;
         }
         while(low<high)
         {
            int count = 1;
            int sum = 0;
            int mid = low + (high-low)/2;
            for(int num: nums)
            {
                if(sum+num > mid)
                {
                    sum = num;
                    count++;
                }
                else
                {
                    sum += num;
                }
            }
            if(count<=k)
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
         }
         return high;
    }
}