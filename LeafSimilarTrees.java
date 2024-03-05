public class LeafSimilarTrees {
    List<Integer> leaf1 = new ArrayList();
    List<Integer> leaf2 = new ArrayList();
    public void preOrder(TreeNode root, int leaf){
        if(root==null){
            return;
        }
        if(root.right==null && root.left==null){
            if(leaf == 1)
                leaf1.add(root.val);
            else
                leaf2.add(root.val);
            return;
        }
        preOrder(root.left, leaf);
        preOrder(root.right, leaf);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        preOrder(root1, 1);
        preOrder(root2, 2);
        System.out.print(leaf1);
        System.out.print(leaf2);
        return leaf1.equals(leaf2);
    }
}