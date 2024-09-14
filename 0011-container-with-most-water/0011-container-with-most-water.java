class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int result=-9999;
        while(left<=right){
            int width=right-left;
            int height1=Math.min(height[left],height[right]);
            int area=width*height1;

            if (result<area){
                result=area;
            }
            if(height[left]<height[right]){
                  left++;
            }
            else{
                right--;
            }
        }
        return result;

    }
}