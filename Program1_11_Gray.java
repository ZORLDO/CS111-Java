/* File Name:          Program1_11_Gray.java

   Programmer:         Michael Gray

   Date Last Modified: Aug. 30, 2016 */

// Program1_11_Gray.java
// This program will display projected future census data. 

public class Program1_11_Gray
{
    public static void main(String[] args)
    {
        System.out.println("Hello out there.");
        System.out.println("I will determine the population for the next 5 years");
        

        double start, births, deaths, immigrants, secondsInYear, year2017, year2018, year2019, year2020, year2021;

        start = 312032486;
        secondsInYear = (60 * 60 * 24 * 365);
        births = (secondsInYear / 7.0);
        deaths = (secondsInYear / 13.0);
        immigrants = (secondsInYear / 45.0);
        year2017 = start + births - deaths + immigrants;
        year2018 = year2017 + births - deaths + immigrants;
        year2019 = year2018 + births - deaths + immigrants;
        year2020 = year2019 + births - deaths + immigrants;
        year2021 = year2020 + births - deaths + immigrants;

        System.out.println("The population in 2017 will be");
        System.out.println(year2017);
        
        System.out.println("The population in 2018 will be");
        System.out.println(year2018);
        
        System.out.println("The population in 2019 will be");
        System.out.println(year2019);
        
        System.out.println("The population in 2020 will be");
        System.out.println(year2020);
        
        System.out.println("The population in 2021 will be");
        System.out.println(year2021);
    }
}
