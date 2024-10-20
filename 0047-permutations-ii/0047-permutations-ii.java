class Solution {
    private void permute(int [] nums ,  Set<List<Integer>> result, int st){
       if(st==nums.length){
        result.add(arrayToList(nums));

       }

       for(int i=st;i<nums.length;i++){
        swap(nums, i, st);
        permute(nums, result, st+1);
        swap(nums , i , st);
       }
    }
    private List<Integer> arrayToList(int [] nums){
        List<Integer> l=new ArrayList<>();
        for(int i: nums){
            l.add(i);
        }
        return l;
    }

    private void swap(int nums[] , int i ,int st){
        int temp=nums[i];
        nums[i]=nums[st];
        nums[st]=temp;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
      Set<List<Integer>> result=new HashSet<>();
        permute(nums, result, 0);
        return new ArrayList(result);
    }
}