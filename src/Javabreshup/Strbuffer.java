package Javabreshup;

import java.nio.ShortBuffer;

public class Strbuffer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("arvindh");
		str.replace(1, 7, "arun");
		System.out.println(str);
		str.delete(0, 1);
		System.out.println(str);
	}

}
