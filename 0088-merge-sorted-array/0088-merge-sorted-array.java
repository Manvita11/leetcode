class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arrayList.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            arrayList.add(nums2[i]);
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            nums1[i] = arrayList.get(i);
        }
    }
}