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
    static class Info{
        int sum;
        boolean isBST;
        int max;
        int min;
        public Info(int sum,boolean isBST,int max,int min){
            this.sum = sum;
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }

   
    int max = Integer.MIN_VALUE; 

    
    private Info maxSum(TreeNode root){
        if(root == null){
            return new Info(0, true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        Info left = maxSum(root.left);
        Info right = maxSum(root.right);

        int currSum = left.sum + root.val + right.sum;
        int currMax = Math.max(root.val, Math.max(left.max, right.max));
        int currMin = Math.min(root.val, Math.min(left.min, right.min));

        if(root.val>left.max && root.val < right.min && left.isBST && right.isBST){
            max = Math.max(currSum,max);
            return new Info(currSum, true, currMax, currMin);
        }
        return new Info(0, false, currMax, currMin);
    }
    
    public int maxSumBST(TreeNode root) {
        maxSum(root);
        return Math.max(max, 0); 
    }
}