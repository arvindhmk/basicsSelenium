package Javabreshup;

import java.util.Calendar;
import java.util.Date;

public class Calendrset 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//The setTime(Date dt) method in Calendar class is used to set Calendars time represented 
		//by this Calendar’s time value, with the given or passed date as a parameter.
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println("Current date and time ==>"+cal1.getTime());
		cal1.set(2019, 11, 3);
		
		Date dt = cal1.getTime();
		cal2.setTime(dt);
		
		System.out.println("Modified date and time==>"+cal2.getTime());
	}

}
