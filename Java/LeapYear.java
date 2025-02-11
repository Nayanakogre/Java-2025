 // Write a Java program that uses an if condition to check if a given year is a leap year. 
// A leap year is divisible by 4 but not by 100, unless it is also divisible by 400


public class LeapYear
{
	public static void main(String args[])
	{
		


        int year = 2000;
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        }
}

	
