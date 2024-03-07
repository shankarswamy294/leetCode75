class NumberOfProvinces:
    def dfs(self, i, isConnected, visited):
        visited[i] = 1
        for j in range(0,len(isConnected[i])):
            if isConnected[i][j]==1 and visited[j]!=1:
                self.dfs(j, isConnected, visited)


    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        visited = [0 for i in isConnected]
        result = 0
        for i in range(0, len(isConnected)):
            if not visited[i]:
                self.dfs(i,isConnected, visited)
                result+=1
        return result