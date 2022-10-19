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
