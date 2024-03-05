public class CountGoodNodesInBinaryTree {
    int count= 0;
    public void traverse(TreeNode root, int maxVal){
        if(root==null){
            return;
        }
        if(root.val>=maxVal){
            maxVal=root.val;
            count+=1;
        }
        traverse(root.left, maxVal);
        traverse(root.right, maxVal);
    }

    public int goodNodes(TreeNode root) {
        traverse(root, root.val);
        return count;
    }
}