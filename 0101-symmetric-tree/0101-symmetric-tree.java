class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        if (root.left != null && root.right != null) {
            if (root.left.val == root.right.val) {
                return preorderTraversal(root.left).equals(revPreorderTraversal(root.right));
            }
        }
        return false;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>(List.of(-1));

        List<Integer> subList = new ArrayList<>();
        subList.add(root.val);
        subList.addAll(preorderTraversal(root.left));
        subList.addAll(preorderTraversal(root.right));
        return subList;
    }

    public List<Integer> revPreorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>(List.of(-1));

        List<Integer> subList = new ArrayList<>();
        subList.add(root.val);
        subList.addAll(revPreorderTraversal(root.right));
        subList.addAll(revPreorderTraversal(root.left));
        return subList;
    }
}