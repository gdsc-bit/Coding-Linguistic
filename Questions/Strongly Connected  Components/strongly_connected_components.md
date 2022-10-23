### Strongly Connected Components (Kosaraju's Algo)

Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, Find the number of strongly connected components in the graph.
 

Example 1:

Input:

![image](https://user-images.githubusercontent.com/90500919/197306502-ce12a9fd-f7ca-47d1-b8bf-8c13a27ffbb1.png)


Output:

3

Explanation:

![image](https://user-images.githubusercontent.com/90500919/197306558-91deee39-4cbe-4621-98fe-2057708d9fcd.png)

>We can clearly see that there are 3 Strongly
Connected Components in the Graph

Example 2:

Input:

![image](https://user-images.githubusercontent.com/90500919/197306726-9ff9f354-0aa1-4b31-ae1c-497f2dba3352.png)

Output:

1

Explanation:


>All of the nodes are connected to each other.
So, there's only one SCC.
 

## Your Task:
You don't need to read input or print anything. Your task is to complete the function kosaraju() which takes the number of vertices V and adjacency list of the graph as inputs and returns an integer denoting the number of strongly connected components in the given graph.
 

Expected Time Complexity: O(V+E)

Expected Auxiliary Space: O(V)
 

# Constraints:

1 ≤ V ≤ 5000

0 ≤ E ≤ (V*(V-1))

0 ≤ u, v ≤ N-1

Sum of E over all testcases will not exceed 25*106
