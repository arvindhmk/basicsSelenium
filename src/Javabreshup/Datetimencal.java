package Javabreshup;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetimencal 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
//		The year (in either 2 or 4 digits)
//		The month (in either 2 digits, First 3 letters of the month or the entire word of the month).
//		The date (it will be the actual date of the month).
//		The day (the day at the given date – like Sun, Mon, Tue, etc.)

		Date dateobj= new Date();
		System.out.println(dateobj);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("hh:mm:ss a dd-MMM-yyyy");
		System.out.println(dateformat.format(dateobj));
		String format1 = "dd-MM-yyyy";
		SimpleDateFormat dateformat1 = new SimpleDateFormat(format1);
		System.out.println(dateformat1.format(dateobj));
		String format2 = "dd-MMM-yyyy";
		SimpleDateFormat dateformat2 = new SimpleDateFormat(format2);
		System.out.println(dateformat2.format(dateobj));
		String format3 = "dd-MMMM-yyyy";
		SimpleDateFormat dateformat3 = new SimpleDateFormat(format3);
		System.out.println(dateformat3.format(dateobj));
	}

}
