package Javaprograms;

import java.util.Calendar;

public class Firstdayofweek 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		int first_Day = cal.getFirstDayOfWeek();
		switch(first_Day)
		{
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tueday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
			
		}
	}

}
