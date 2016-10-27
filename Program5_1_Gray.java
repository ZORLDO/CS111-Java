/* Chapter  5 assignment 1
   File Name:          Program5_1_Gray.java
   Programmer:         Michael Gray
   Date Last Modified: October 27, 2016

   Problem Statement: Create a driver application to test the HotDogStand class. Allow the user to sell hotdogs and assign id numbers
                      to individual stands. Track individual sales as well total sales.


   
   
   Overall Plan: 
   1. Declare initial variables and scanner
   2. Create 3 hotdog stands
   3. Prompt the user for id numbers
   4. Use the setter methods to assign them
   5. Prompt the user for number of hotdogs sold
   6. Use a for loop to use the justSold method for each sale
   7. Repeat steps 5 and 6 twice
   8. Use the printOut and printTotal methods to show results

   
   main class - Program4_6_Gray.java
   
   DATA DICTIONARY
   ---------------
   NAME	    		   TYPE        DESCRIPTION
   =================== =========== ====================
   id                  string      the id number entered by the user
   sold                int         the number of hotdogs sold
   
*/


import java.util.*;


public class Program5_1_Gray {

    public static void main(String[] args) {


        //declaring initial variables
        String id;
        int sold;
        Scanner keyboard = new Scanner(System.in);
    
        HotDogStand stand1           = new HotDogStand();
        HotDogStand stand2           = new HotDogStand();
        HotDogStand stand3           = new HotDogStand(); 
    
    
        //entering the id numbers
        System.out.println(">Hotdog Stand App");
        System.out.printf("\n \nPlease enter the id number for your first hotdog stand: ");
        id               = keyboard.next();
        stand1.setIdNumber(id);
    
        
        System.out.printf("Please enter the id number for your second hotdog stand: ");
        id               = keyboard.next();
        stand2.setIdNumber(id);
    
        System.out.printf("Please enter the id number for your third hotdog stand: ");
        id               = keyboard.next();
        stand3.setIdNumber(id);
        
        //lol lets sell some hotdogs
        
        //from stand 1
        System.out.println();
        System.out.printf("Enter number of hotdogs sold from stand 1: ");
        
        sold            = keyboard.nextInt();
        
        for(int i = 0; i <= sold; i++)
        {
            stand1.justSold();
        }
        
        //from stand 2
        System.out.printf("Enter number of hotdogs sold from stand 2: ");
        
        sold            = keyboard.nextInt();
        
        for(int i = 0; i <= sold; i++)
        {
            stand2.justSold();
        }
        
        //from stand 3
        System.out.printf("Enter number of hotdogs sold from stand 3: ");
        
        sold            = keyboard.nextInt();
        
        for(int i = 0; i < sold; i++)
        {
            stand3.justSold();
        }
        
        //Sales report
        System.out.println("___________________________");
        System.out.println();
        stand1.printSold();
        stand2.printSold();
        stand3.printSold();
        System.out.println();
        stand1.printTotal();
        System.out.println();
        
        
        
   }
}
