class Solution {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }

        int leftVal = kthSmallest(root.left, k);
        if (leftVal != 0) {
            return leftVal;
        }

        count++;
        if (k == count) {
            return root.val;
        } else {
            int rightVal = kthSmallest(root.right, k);
            if (rightVal != 0) {
                return rightVal;
            }
        }

        return 0;
    }
}