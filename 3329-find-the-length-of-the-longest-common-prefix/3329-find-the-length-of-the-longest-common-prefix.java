class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int item:arr2) {
            while(item>0) {
                set.add(item);
                item = item/10;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int item : arr1) {
            int temp = item;
            int count = 0;
            while(!set.contains(temp)&&temp>0) {
                temp = temp/10;
            }
            while(temp>0) {
                count++;
                temp=temp/10;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}