/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void help(TreeNode root, List<String> ans, String s){
        if(root==null)
        return;
        if(root!=null){
            s+=Integer.toString(root.val);
            if(root.left==null && root.right==null){
                ans.add(s);
            }
            else{
                s+="->";
                help(root.left,ans,s);
                help(root.right,ans,s);
            }
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
      List<String>ans= new ArrayList<>();
      help(root,ans,"");
      return ans;  
    }
}