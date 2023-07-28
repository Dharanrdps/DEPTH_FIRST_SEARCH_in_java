# DEPTH_FIRST_SEARCH_in_java
DFS stands for Depth-First Search. It is another algorithm used to traverse or search a graph or tree data structure. Unlike BFS, which explores nodes level by level, DFS explores as far as possible along each branch before backtracking. In other words, it goes deeper into the graph before visiting neighbors at the current level.

Key points about DFS:

1. Stack-based Approach: DFS uses a stack (or recursion) to keep track of nodes to be visited. The nodes are pushed onto the stack in the order they are discovered, and they are processed in the reverse order (last-in, first-out - LIFO).

2. Recursive Nature: DFS can be implemented using recursion, where a function calls itself to explore deeper nodes. Each recursive call explores one branch until it reaches a leaf node, then it backtracks and explores other branches.

3. Visited Nodes: Similar to BFS, DFS also keeps track of the visited nodes to avoid revisiting nodes and prevent infinite loops in the case of cyclic graphs.

Pseudocode for DFS algorithm (recursive version):

```
DFS(graph, current, visited):
    if current is not in visited:
        add current to visited set
        process current node

        for each neighbor of current:
            DFS(graph, neighbor, visited)
```

Pseudocode for DFS algorithm (stack-based version):

```
DFS(graph, source):
    stack = empty stack
    visited = empty set

    push source into stack

    while stack is not empty:
        current = pop from stack

        if current is not in visited:
            add current to visited set
            process current node

            for each neighbor of current:
                push neighbor into stack
```

DFS is useful for several tasks, including:
- Topological sorting of directed acyclic graphs (DAGs).
- Finding connected components in a graph.
- Detecting cycles in a graph.
- Solving puzzles and games that involve exploring possible states.

DFS does not guarantee finding the shortest path, as it can get trapped in a deep branch before exploring other shorter paths. However, it has its advantages in certain scenarios and can be more memory-efficient than BFS since it only needs to keep track of a single branch at a time. The time complexity of DFS is also O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph or tree.
