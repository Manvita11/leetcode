class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            product = product * i;
            max = Math.max(max, product);
            if(product == 0){
                product = 1;
            }
        }
        product = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            product = product * nums[i];
            max = Math.max(max, product);
            if(product == 0){
                product = 1;
            }
        }
        return max;
    }
}