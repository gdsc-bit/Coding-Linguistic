import java.util.*;

public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        
        System.out.println("Enter the array");
        int[] arr = new int[len];
        
        for(int i=0; i<len; i++)
        {
            arr[i] = sc.nextInt();       
        }
        
        System.out.println("Enter the key");
        int key = sc.nextInt();
        
        System.out.println("Element found at index : "+Search(arr, key));
    }
    
    public static int Search(int[] arr, int key)
    {
        int index = -1;
        
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low < high)
        {
            mid = low + (high - low)/2;
            
            if(arr[mid] == key)
            {
                index = mid;
                break;
            }
            
            else if(arr[mid] > key)
                high = mid - 1;
                
            else
                low = mid + 1;    
        }
        
        return index;
    }
}
