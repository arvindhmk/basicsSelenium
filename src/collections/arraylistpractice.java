package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class arraylistpractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String[] s1= {"Arvindh","sai rishvanth","kutty mai","arun"};
		
		List<String> al = Arrays.asList(s1);
		
		//System.out.println(al);
		
		//System.out.println(al.get(3));
		
		al.set(2, "small mai");
		
		//System.out.println(al);
		
		List<String> sub = (al.subList(0,2));
		
LinkedList<String> ll = new LinkedList<String>();

ll.addAll(sub);
System.out.println(ll);

ll.retainAll(al);

System.out.println(al);
System.out.println(ll);
		
		
		
	}

}
