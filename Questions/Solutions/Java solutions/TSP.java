import java.util.*;

    public class lab10b
    {
      static int max = 100;
      static final int inf = 999;

      public static void main(String [] args)
      {
        int cost = inf, n;
        int [][]c = new int[max][max];
        int []tour = new int[max];
        Scanner sc = new Scanner(System.in);
        System.out.println("Travelling sales man problem Dynamic Programming");
        System.out.print("Enter the no. of. cities: ");
        n = sc.nextInt();
        System.out.println("Enter the cost matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] = sc.nextInt();
                if(c[i][j]==0)
                    c[i][j]=inf;
            }
        }
        for(int i=0;i<n;i++)
            tour[i]=i;
        cost = tsp(c,tour,0,n);
        System.out.println("Minimum tour cost = "+cost);
        System.out.println("\nTour: ");
        for(int i=0;i<n;i++)
            System.out.print(((tour[i])+1) +"->");
        System.out.println(tour[0]+1);
        sc.close();
     }
      static int tsp(int[][] c, int[] tour, int start, int n)
      {
        int i,j,k,cost,mincost=inf;
        int []mintour = new int[max];
        int []temp = new int[max];
        if(start==n-2)
            return c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0];
        for(i=start+1;i<n;i++)
        {
            for(j=0;j<n;j++)
                temp[j]=tour[j];
            temp[start+1]=tour[i];
            temp[i]=tour[start+1];
            if(c[tour[start]][tour[i]]+(cost=tsp(c,temp,start+1,n))<mincost)
            {
                mincost = c[tour[start]][tour[i]]+cost;
                for(k=0;k<n;k++)
                    mintour[k]=temp[k];
            }
        }
        for(i=0;i<n;i++)
            tour[i]=mintour[i];
        return mincost;
     }
    }
