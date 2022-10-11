# Hamiltonian Cycle using Backtracking

> The Hamiltonian cycle is the cycle in the graph which visits all the vertices in graph exactly once and terminates at the starting node. It may not include all the edges

### Problem Statement:
The Hamiltonian cycle problem is the problem of finding a Hamiltonian cycle in a given  connected
undirected Graph G of n vertices using backtracking principle.

### Example

Consider the following undirected graph G with '5' vertices.

![image](https://user-images.githubusercontent.com/86611624/194923550-4c8ced3b-367d-46d0-85e1-dd7d27279408.png)


For the graph shown above, a path (A – B – E – D – C – A) forms a Hamiltonian cycle.


## Code :

    import java.util.*;
    public class lab12
    {
        boolean found = false;
        int n;
        int[][] g;
        int[] x;
    
        public static void main(String[] args)
        {
          lab12 h = new lab12();
          h.getData();
          System.out.println("\nSolution:");
          h.hamiltonian(2);
          h.noSolution();
        }
        public void noSolution()
        {
          if(!found)
            System.out.println("No Solution");
        }
        public void getData()
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("\t\t\t-------------Hamiltonian Cycle-------------");
          System.out.print("\nEnter the no. of. vertices: ");
          n = sc.nextInt();
          g = new int[n+1][n+1];
          x = new int[n+1];
          System.out.println("Enter 1 if there exits an edge between the vertices, else enter 0");
          for(int i=1;i<=n;i++)
          {
            for(int j=1;j<=n;j++)
            {
                if((i < j))
                {
                    System.out.print(i+" and "+j+" : ");
                    g[i][j]=g[j][i]=sc.nextInt();
                }
                if(i==j)
                    g[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++)
            x[i]=0;
        x[1]=1;
        sc.close();
      }
      public void nextValue(int k, int[][] g, int[] x, int n)
      {
        while(true)
        {
            x[k]=(x[k]+1)%(n+1);
            if(x[k]==0)
                return;
            if(g[x[k-1]][x[k]]!=0)
            {
                int j;
                for(j=1;j<k;j++){
                    if(x[j]==x[k])
                        break;
                }
                if(j==k){
                    if((k<n)||((k==n)&&(g[x[n]][x[1]]!=0)))
                        return;
                }
            }
        }
      }
      public void hamiltonian(int k) 
      {
        while (true)
        {
            nextValue(k,g,x,n);
            if (x[k] == 0)
                return;
            if (n == k) {
                for (int i = 1; i <= k; i++)
                    System.out.print(x[i] + " ");
                System.out.println(x[1]);
                found=true;
                return;
            } else
                hamiltonian(k + 1);
        }
      }
    }


## Output:

  			-------------Hamiltonian Cycle-------------

    Enter the no. of. vertices: 5
    Enter 1 if there exits an edge between the vertices, else enter 0
    1 and 2 : 1
    1 and 3 : 1
    1 and 4 : 0
    1 and 5 : 0
    2 and 3 : 0
    2 and 4 : 1
    2 and 5 : 1
    3 and 4 : 1
    3 and 5 : 0
    4 and 5 : 1

    Solution:
    1 2 5 4 3 1
    1 3 4 5 2 1


