package Javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Arraylistexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<String>();
		ls.add("Good Day");
		ls.add("Britania");
		ls.add("Parle G");
		ls.add("Parle G");
		System.out.println(ls);
		System.out.println(ls.get(1));
		System.out.println(ls.indexOf("Parle G"));
		System.out.println(ls.lastIndexOf("Parle G"));
		System.out.println(ls.indexOf("50-50"));
		
		List<String> ls1 = new ArrayList<String>();
		ls1.addAll(ls);
		System.out.println(ls1);
		//ls1.clear();
		//System.out.println(ls1);
		ls.remove(3);
		System.out.println(ls);
		System.out.println(ls1.remove("Parle G"));
		System.out.println(ls1);
		ls1.set(0, "Milkbikis");
		System.out.println(ls1);
		System.out.println(ls1.isEmpty());
		System.out.println(ls1.size());
	}

}
