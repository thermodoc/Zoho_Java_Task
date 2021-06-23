package Zoho_Task;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TimeandDate
{
	public void parseTimeandDate(int value,int diff)
	{
		 if(diff > 0) {
		    	System.out.println("System time is greater");
		    } else if (diff < 0) {
		    	 System.out.println("Input Time  is greater");
		    } else {
		   	 if (value > 0)
		         System.out.println("System time is greater");
		     else if (value == 0)
		         System.out.println("Sytem is equal to"
		                            + " Input time ");
		     else
		         System.out.println("Input Time  is greater");
			}

		
	}
	public static void main(String args[])
	{
	TimeandDate obj =new TimeandDate();
	Scanner input = new Scanner(System.in);
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	System.out.println(date);
	System.out.println(time);
	System.out.println("Enter the date:");
	String Date = input.next();
	System.out.println("Enter the time: ");
	String Time = input.next();

	LocalTime inputTime=LocalTime.parse(Time);
	LocalDate inputDate = LocalDate.parse(Date);

	int value = time.compareTo(inputTime);
    int diff = date.compareTo(inputDate);
    obj.parseTimeandDate(value, diff);
   
    

	

	}
}
