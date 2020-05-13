package Javabreshup;

import java.util.Calendar;

public class Calendr 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//The getInstance() method in Calendar class is used to get a calendar using the current time zone and locale of the system.
		
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.getInstance());
		System.out.println(cal.getTime());
		System.out.println(cal.getCalendarType());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendar.MONTH));
		cal.set(Calendar.MONTH,11);
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}