class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        if(nums.length == 2) return nums[1] - nums[0];

        int lp = 0;
        int rp = 1;
        int diff = 0;

        while(lp < nums.length-1 && rp < nums.length){
            int newdiff = nums[rp]-nums[lp];
            if(newdiff > diff){
                diff = newdiff;
            }
            lp++;
            rp++;
        }

        return diff;
    }
}