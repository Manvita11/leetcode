class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
 
        return compare(p,q);
    }
    public void inorder(TreeNode root,List<Integer>l){
        if(root==null){
            l.add(null);
            return ;
        }
        l.add(root.val);
        inorder(root.left,l);
        inorder(root.right,l);
    }

    public boolean compare(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }

        return r1.val==r2.val&&compare(r1.left,r2.left)&&compare(r1.right,r2.right);
    }
}