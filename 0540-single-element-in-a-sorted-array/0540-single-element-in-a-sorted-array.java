class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        int mid ;
        while (high >= low){
            mid = low + (high - low)/2;
            if(mid > 0 && nums[mid-1] == nums[mid]){
                if((mid - 1 - low) % 2 == 0){
                    low = mid + 1;
                }else{
                    high = mid - 2;
                }
            }else if(mid < n - 1 && nums[mid + 1] == nums[mid]){
                if((high - mid + 1) % 2 == 0){
                    high = mid - 1;
                }else{
                    low = mid + 2;
                }
            }else{
                return nums[mid];
            }
        }
        return 0; 
    }
}