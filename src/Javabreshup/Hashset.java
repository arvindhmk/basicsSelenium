package Javabreshup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset 
{
//Does not allow duplicate
	//random order
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Set<String> hs = new  HashSet<String>();
		
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		hs.add("seven");
		hs.add("eight");
		hs.add(null);
		hs.add(null);
		//hs.remove("three");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("two"));
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}

}
