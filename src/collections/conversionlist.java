package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class conversionlist 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Vector<String> vec = new Vector<String>();
		vec.addElement("E1");
		vec.addElement("E2");
		vec.addElement("E3");
		System.out.println(vec);
		
		
		ArrayList<String> liele = Collections.list(vec.elements());
		System.out.println(liele);
		
		
		ArrayList<String> li2 = new ArrayList<String>(liele);
	}

}
