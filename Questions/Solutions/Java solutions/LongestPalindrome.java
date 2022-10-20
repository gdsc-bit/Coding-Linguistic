class LongestPalindrome {
    
    public boolean isPalindrome(String a){
        int i=0;
        int j=a.length()-1;
        while(i<=j){
            if(a.charAt(i)!=a.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
    
    public String printLCS(String a, String b){
        
        int m=a.length();
        int n=b.length();
        String ans="";
        
        int[][] t=new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++)
            t[i][0]=0;
        
        for(int j=0;j<n+1;j++)
            t[0][j]=0;
        
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
            if(a.charAt(i-1)==b.charAt(j-1)){
                t[i][j]=1+t[i-1][j-1];
                if(ans.length()<t[i][j] && isPalindrome(a.substring(i-t[i][j],i)))
                    ans=a.substring(i-t[i][j],i);
            }
                else
                    t[i][j]=0;
            }
        }
        
        return ans;
    }
    
    
    public String longestPalindrome(String s) {
        
        String str="";
        
        for(int i=0;i<s.length();i++){
            str=s.charAt(i)+str;
        }
        
        return printLCS(s,str);
    }
  
  
  public static void main(String argc[])
    {
        Scaneer sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPalindrome(str));
    }
  
  
}
