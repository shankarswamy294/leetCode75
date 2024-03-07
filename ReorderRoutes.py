class ReorderRoutes:

    def __init__(self):
        self.count=0

    def dfs(self, city, edges, cityMap, visited):
        visited[city]=1
        for neighbour in cityMap[city]:
            if visited[neighbour]==0:
                if (neighbour, city) not in edges:
                    self.count+=1
                self.dfs(neighbour, edges, cityMap, visited)

    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        edges = {(a,b) for a,b in connections}
        cityMap = {city:[] for city in range(n)}
        visited = [0 for i in range(n)]
        for each in connections:
            cityMap[each[0]].append(each[1])
            cityMap[each[1]].append(each[0])
        self.dfs(0, edges, cityMap, visited)
        return self.count
        
            