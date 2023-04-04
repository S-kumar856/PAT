graph = {
    10:[20,40,50],
    20:[10,40],
    30:[40,50],
    40:[10,20,30,50],
    50:[10,30,40]
}
def BFT(graph,start):
    q=[start]
    visited = [start]
    
    while len(q) != 0:
        ele = q.pop(0)
        print(ele,end=" ")
        for i in graph[ele]:
            if i not in visited:
                q.append(i)
                visited.append(i)
def DFS(graph,start,visited=None):
    stack = [start]
    if visited == None:
        visited=[]
    visited.append(start)
    print(start)
    for i in graph[start]:
        if i not in visited:
            visited.append(i)
            DFS(graph,i, visited)




# BFT(graph,(int(input())))
DFS(graph, 20)