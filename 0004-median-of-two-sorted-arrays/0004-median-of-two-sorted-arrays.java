class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int mid1 = (n + m - 1) / 2;
        int mid2 = (n + m) / 2;

        int i = 0, j = 0, count = 0;
        int median1 = 0, median2 = 0;

        while (i < n || j < m) {
            int val;
            if (i < n && (j >= m || nums1[i] < nums2[j])) {
                val = nums1[i];
                i++;
            } else {
                val = nums2[j];
                j++;
            }
            if (count == mid1) {
                median1 = val;
            }
            if (count == mid2) {
                median2 = val;
                break;
            }
            count++;
        }

        return (median1 + median2) / 2.0;

    }
}