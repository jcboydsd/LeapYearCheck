package leapyearcheck;

/******************************************************************************
 * LeapYearCheck.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 1060
 *
 * This program asks for the user to input a year and returns the number of 
 * days in February and if the year is a leap year
 *****************************************************************************/

import java.util.*; //Scanner

public class LeapYearCheck {

    public static int daysInFebruary(int year)
    {
        if ((year % 100 == 0) && (year % 400 == 0))
        {
            return 29;
        }
        else 
            if ((year % 100 != 0) && (year % 4 == 0))
            {
                return 29;
            }
            else
            {
                return 28;
            } //end if
    } //end daysInFebruary
    
    public static boolean isLeapYear(int year)
    {
        if ((year % 100 == 0) && (year % 400 == 0))
        {
            return true;
        }
        else
            if ((year % 100 != 0) && (year % 4 == 0))
            {
                return true;
            }
            else
            {
                return false;
            } //end if
    } //end isLeapYear
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("Leap Year Check by JC Boyd\n");
        System.out.print("Enter year: ");
        int year = Integer.parseInt(stdIn.nextLine());
        System.out.println("The number of days in February is " + daysInFebruary(year));
        if (isLeapYear(year))
        {
            System.out.println("This year IS a leap year");
        }
        else
        {
            System.out.println("This year is NOT a leap year");
        }
    } //end main
    
} //end class LeapYearCheck

