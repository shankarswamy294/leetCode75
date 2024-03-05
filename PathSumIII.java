public class PathSumIII {
    int paths = 0;
    public void findPaths(TreeNode root, long sum, int target){
        if(root==null)
            return;

        if(root.val+sum==target)
            paths+=1;

        findPaths(root.left, root.val+sum, target);
        findPaths(root.right, root.val+sum, target);
    }

    public void dfs(TreeNode root, int targetSum){
        if(root == null)
            return;

        findPaths(root, 0, targetSum);
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }

    public int pathSum(TreeNode root, int targetSum){
        dfs(root, targetSum);
        System.out.println(paths);
        return paths;
    }
}