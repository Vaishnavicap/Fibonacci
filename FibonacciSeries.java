
package fibonacciseries;

import java.util.Scanner;


public class FibonacciSeries 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int a = 0, b = 1, c;
        
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        System.out.println("Fibonacci Series "+n+" Elements");
        System.out.print(a);
        System.out.print(" "+b);
    
        for (int i = 2; i < n ; ++i)    
        {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;  
        }  
        System.out.println();
    }
    
}
