package Algorithm;

public class BinarySearch {
    
    
    //BinarySearch using loop
    
    static int binarySearch(int arr[], int x)
    {
        int l=0, r = arr.length -1;
        while(l <= r)
        {
            int m = l+(r-l)/2;
            
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m+1;
            else
                r = m-1;
        } 
        
        return -1;
    }
    
    public static void main(String[] args){
    
        int arr[] = {-1, 52, 22, 17, 10, 11, 13, 14, 87};
        int n = arr.length;
        int x = 11;
        int result = binarySearch(arr,x);
        
        if (result == -1)
                  System.out.println("Element not found!");
        else 
                   System.out.println("Element found at index:" + result);
        
        
      
        
        
        
    }
}
