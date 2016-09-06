/* File Name:          MyFirstProgram.java

   Programmer:         Michael Gray

   Date Last Modified: Aug. 26, 2016 */

// MyFirstProgram.java
// This program will ask the user for two integer numbers, add
// them together and display the result.

import java.util.*;

public class MyFirstProgram
{
    public static void main(String[] args)
    {
        System.out.println("Hello out there.");
        System.out.println("I will add three numbers for you.");
        System.out.println("Enter three whole numbers on a line:");

        int n1, n2, n3, v1, v2;

        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt( );
        n2 = keyboard.nextInt( );
        n3 = keyboard.nextInt( );
        v1 = (n1 * n2 * n3);
        v2 = (n1 + n2 + n3);

        System.out.println("The sum of those three numbers is");
        System.out.println(n1 + n2 + n3);
        System.out.println("The product of those three numbers is");
        System.out.println(n1 * n2 * n3);
      
        
        System.out.println("The sum of those three numbers divided by their product is");
        System.out.println(v2 / v1);
        
    }
}
