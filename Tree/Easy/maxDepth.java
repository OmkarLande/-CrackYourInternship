// 104. Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        return 1 + Math.max(ld, rd);
    }
}