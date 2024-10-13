class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
           if (nums == null || nums.length == 0) {
            return null;  
        }
        return constructBST(nums, 0, nums.length - 1);  
    }

   
    private TreeNode constructBST(int[] nums, int left, int right) {
        if (left > right) {  
            return null;
        }

      
        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        
        root.left = constructBST(nums, left, mid - 1);

        
        root.right = constructBST(nums, mid + 1, right);

        return root;  
    }

    
    public void printTree(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                System.out.print("null ");
            }
        }
    }
}