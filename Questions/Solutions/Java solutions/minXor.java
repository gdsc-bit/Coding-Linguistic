class Solution{

    static int minxorpair(int N, int arr[]){
        
        Arrays.sort(arr);
        
        int minXor=Integer.MAX_VALUE;
        
        for(int i=0;i<N-1;i++){
            
            minXor = Math.min(minXor, arr[i]^arr[i+1]);
        }
        return minXor;
    }
  
  public static void main(String args[])
    {
        int arr[] = { 9, 5, 3 };
        int n = arr.length;
        System.out.println(minxorpair(arr, n));
    }
  
}
