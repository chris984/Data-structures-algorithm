package Algorithm;

import java.util.Scanner;

public class Recursion {
    
    //Recursion method
    static int factorial(int n)
    {
        if(n <= 1)
        {
          return 1;
        }
        else
        {
          return n * factorial(n-1);
    }
    }    
    public static void main(String[] args)
    {
        
         System.out.println("Please enter a number ");
         //Declaring scanner for getting user input
        Scanner Input = new Scanner(System.in);
          int num = Input.nextInt();
        
        //Output
        System.out.println("Factorial of  " + num + "!" + " is " + factorial(num));
    
    
    
    
    }
    
}
