// 108. Convert Sorted Array to Binary Search Tree

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortHelper(nums, 0, nums.length - 1);
    }

    public TreeNode sortHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortHelper(nums, left, mid - 1);
        node.right = sortHelper(nums, mid + 1, right);

        return node;
    }
    
}