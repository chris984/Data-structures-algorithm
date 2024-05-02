package Algorithm;

public class LinearSearch {
    
    public static int LinearSearch(int[] list, int target){
           
        for (int index = 0; index < list.length; index++)
                if (list[index] == target)
                    return index;
        return -1;
    }
    
    
    
    public static void main(String [] args){
    
        int[] list = {22, 55, 60, 30,62,35,50};
        
        int x = 30;
        
        if (LinearSearch(list, x) == -1) {
            
            System.out.print("Element not found");
        }else{
                
            System.out.print("index of " + LinearSearch(list, x));
        }
        
       
        
       
    
    
    }
    
}
