class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if(k==0 || nums1.length==0 || nums2.length==0 ){
            return result;
        }
        PriorityQueue<int[]> ds = new PriorityQueue<>((a,b)->a[0]+a[1]-b[0]-b[1]);
        for(int i=0;i<Math.min(k,nums2.length);i++){
            ds.offer(new int[]{nums1[0],nums2[i],0});
        }
        while(k-- >0 && !ds.isEmpty()){
            List<Integer> currentPair = new ArrayList<>();
            int [] pair = ds.poll();
            currentPair.add(pair[0]);
            currentPair.add(pair[1]);
            result.add(currentPair);

            if(pair[2] < nums1.length-1){
                ds.offer(new int[]{nums1[pair[2]+1],pair[1],pair[2]+1});
            }
        }
        return result;
    }
}