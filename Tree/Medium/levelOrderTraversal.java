// 102. Binary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        List<List<Integer>> resList = new LinkedList<List<Integer>>();

        if(root == null) return resList;

        qu.offer(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            List<Integer> subList = new LinkedList<Integer>();

            for(int i = 0; i<len; i++){
                if(qu.peek().left != null ) qu.offer(qu.peek().left);
                if(qu.peek().right != null ) qu.offer(qu.peek().right);
                subList.add(qu.poll().val);
            }
            resList.add(subList);
        }

        return resList;
    }
}