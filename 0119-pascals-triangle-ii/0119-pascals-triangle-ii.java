class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<=n;i++){
            List<Integer> curr = new ArrayList<>();

            if(i==0){
                curr.add(1);
            }
            else if(i==1){
                curr.add(1);
                curr.add(1);
            }
            else{
                curr.add(1);
                List<Integer> prev = ans.get(ans.size()-1);
                for(int j=1;j<prev.size();j++){
                    curr.add(prev.get(j-1)+prev.get(j));
                }
                curr.add(1);
            }
            ans.add(curr);
        }

        return ans.get(n);
    }
}