class Solution {
    private static void reverse(int []arr, int start, int end){
        if(start == end)return;
        end = end-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i =n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,n);
            return;
        }

        for(int i = n-1; i>=index; i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums,index+1,n);
    }
}