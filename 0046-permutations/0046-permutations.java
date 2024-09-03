class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums , new ArrayList<>());
        return ans ;
    }
    public void helper(int[] nums , List<Integer> temp){

        if(temp.size() == nums.length)
         {   
            ans.add(new ArrayList<>(temp));
            return ;
         }
        for(int i : nums){

            if(!temp.contains(i)){
                temp.add(i);
                helper(nums , temp);
                temp.remove(temp.size()-1);
            }
        }

        return ;

    }
}