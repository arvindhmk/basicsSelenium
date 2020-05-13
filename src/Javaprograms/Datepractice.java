package Javaprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datepractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Date dt = new Date();
		System.out.println(dt.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY",Locale.ENGLISH);
		System.out.println(sdf.format(dt));
		
		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.getInstance());
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.getTime());
		System.out.println(Integer.valueOf(c.get(Calendar.MONTH)+1));
		
	}

}
