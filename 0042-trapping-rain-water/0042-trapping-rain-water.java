class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while(left <= right){
            if(height[left] < height[right]){
                if(leftMax < height[left]) leftMax = height[left];
                else ans = ans + leftMax-height[left];
                left++;
            }
            else{
                if(rightMax < height[right]) rightMax = height[right];
                else ans = ans + rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}