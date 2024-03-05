public class LongestZigZagPathInABinaryTree {
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
    
    int max_depth = 0;
    Map<Map<TreeNode, Integer>, Integer> depthHash = new HashMap<>();

    public int zigZag(TreeNode root, Integer moveTo, int depth){
        if (moveTo!=null){
            if((moveTo==1 && root.right==null) || (moveTo==0 && root.left==null)){
                return depth;
            }else{
                Map<TreeNode,Integer> key = new HashMap<>();
                key.put(root, moveTo);
                if(!depthHash.containsKey(key)){
                    depthHash.put(key, moveTo == 1 ? zigZag(root.right, 0, depth+1) : zigZag(root.left, 1, depth+1));
                }
                return depthHash.get(key);
            }
        }else{
            return depth;
        }
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        max_depth = Math.max(max_depth, Math.max(zigZag(root, 0, 0), zigZag(root, 1, 0)));
        inOrder(root.right);
    }

    public int longestZigZag(TreeNode root) {
        inOrder(root);
        return max_depth;
    }
}
