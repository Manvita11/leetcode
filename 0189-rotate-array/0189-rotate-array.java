class Solution {

    public void rotateBy(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotateBy(nums, 0, nums.length - k -1);
        rotateBy(nums, nums.length -k, nums.length - 1);
        rotateBy(nums, 0, nums.length - 1);
    }
}