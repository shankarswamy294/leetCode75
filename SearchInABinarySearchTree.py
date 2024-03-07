class SearchInABinarySearchTree:
    def dfs(self, root, val):
        if not root:
            return None
        if root.val==val:
            return root

        left = self.dfs(root.left, val)
        if left!=None:
            return left
        right = self.dfs(root.right, val)
        if right!=None:
            return right

        return None

    def bfs(self, root, val):
        q = [root]

        while q:
            e = q.pop()
            if e.val==val:
                return e
            if e.left:
                q.append(e.left)
            if e.right:
                q.append(e.right)

        return None
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        # return self.dfs(root, val)
        return self.bfs(root, val)