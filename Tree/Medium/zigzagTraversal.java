// 103. Binary Tree Zigzag Level Order Traversal

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        List<List<Integer>> resList = new LinkedList<List<Integer>>();

        if (root == null)
            return resList;

        qu.offer(root);
        boolean isLToR = true;
        while (!qu.isEmpty()) {
            int len = qu.size();
            LinkedList<Integer> subList = new LinkedList<Integer>();

            for (int i = 0; i < len; i++) {
                TreeNode currentNode = qu.poll();
                if (isLToR) {
                    subList.add(currentNode.val);
                } else {
                    subList.addFirst(currentNode.val);
                }

                if (currentNode.left != null) qu.offer(currentNode.left);
                if (currentNode.right != null) qu.offer(currentNode.right);
            }
            resList.add(subList);
            isLToR = !isLToR;
        }

        return resList;
    }
}