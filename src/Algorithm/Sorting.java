package Algorithm;

import java.util.Scanner;
public class Sorting {
  
    public static void main(String[] args)
    {      
    
    Scanner input = new Scanner(System.in);
    int size;
    System.out.println("Enter the number of size of array");
    size = input.nextInt();
    int[] a = new int[size];
    System.out.println("Enter the array element");
    
    //For reading the element
    for(int i=0;i<size;i++) {
        a[i] = input.nextInt();
    }
    
    //For Sorting the element lowest to highest
    for(int i = 0; i < a.length; i++)
    {
        for(int j = 0; j < a.length - 1; j++)
        {
                if(a[i] > a[j + 1])
                {
                    
                    int temp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
    
    
    
    }
        //For Displaying the element
//      for(int i = 0; i < a.length; i++)
//      {
//      
//          System.out.print(a[i] +"  ,");
//      
//      
//      }
      
      System.out.println("The lowest value is " + a[size - size] + " and The highest value is " + a[size-1]);
        
        
      
        
    
    }
    
}
