class Solution {
    List<Integer> ans;
    int maxVal;
    int currVal = Integer.MAX_VALUE;
    int count = 0;
    public int[] findMode(TreeNode root) {
        ans = new ArrayList<>();
        maxVal = 0;
        inorder(root);
        int[] arrAns = new int[ans.size()];
        for(int i = 0;i < arrAns.length; ++i) arrAns[i] = ans.get(i);
        return arrAns;
    }
    private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
      
        if(currVal != node.val){
            count = 0;
            currVal = node.val;
         }
        if(++count == maxVal){
                ans.add(node.val);
            }else if(count > maxVal){
                maxVal = count;
                ans.clear();
                ans.add(node.val);
            }
            inorder(node.right);
        }

    }