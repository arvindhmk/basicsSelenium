package Javabreshup;

import java.util.ArrayList;
import java.util.List;

public class Arraylistcol 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<String> str = new ArrayList<String>();
		str.add("one");
		str.add("two");
		str.add("three");
		str.add("four");
		System.out.println(str);
		str.add(3, "three.five");
		System.out.println(str.get(3));
		str.add(null);
		str.add(null);
		//str.remove(5);
		//str.remove("four");
		//str.removeAll(str);
		System.out.println(str);
		System.out.println(str.contains("one"));
		System.out.println(str.indexOf("five"));
		System.out.println(str.isEmpty());
		
		
	}

}
