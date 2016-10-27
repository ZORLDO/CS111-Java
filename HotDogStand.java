/* Chapter  5 assignment 1
   File Name:          HotDogStand.java
   Programmer:         Michael Gray
   Date Last Modified: October 27, 2016

   Problem Statement: Create a HotDogStand class with instance variables for id number, and hotdogs sold. Also create a static
                      variable for to track total sales. Include a method to display the results to the user.


   
   
   Overall Plan: 
   1. Create the class
   2. Declare all instance variables
   3. Create setters and getters for each
   4. Create a justSold method that adds to hotDogsSold and totalSold each time it is invoked
   5. Create methods to print data to user

   
   main class - Program4_6_Gray.java
   
   DATA DICTIONARY
   ---------------
   NAME	    		   TYPE        DESCRIPTION
   =================== =========== ====================
   idNumber            string      the id number given to each hotdog stand
   hotDogSold          int         number of hotdogs sold by each stand
   totalSold           int         number of sales across all hotdog stands

*/




import java.util.*;

public class HotDogStand {

    //instance variables
    private String idNumber;
    private int hotDogsSold;
    private static int totalSold;
    
    //setters and getters    
    public void setIdNumber(String id)
    {
        idNumber    = id;
    }
    public void setHotDogsSold(int sold)
    {
        hotDogsSold = sold;
    }
    public String getIdNumber()
    {
        return idNumber;
    }
    public int getHotDogsSold()
    {
        return hotDogsSold;
    }
    
    public void justSold() 
    {
        hotDogsSold++;
        totalSold++;
    }
    
    public void printSold()
    {
        System.out.println("Number of hotdogs sold at this stand: " + (hotDogsSold - 1));
    }
    public void printTotal()
    {
        System.out.println("Total hotdogs sold: " + (totalSold - 3));
    }
    
}    
    
