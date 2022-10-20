class LastDigitCount {
    static int countLastDigitK(Long low, Long high, Long K) {
        
        long rem;
        
        while(true){
            rem = low%10;
            if(rem==K)
            break;
            low++;
        }
        
        return (int)(high - low)/10 + 1;
    }
  
  public static void main(String argc[])
    {
        int low = 3, high = 35, k = 3;
        System.out.println(counLastDigitK(low, high, k));
    }
        
}
