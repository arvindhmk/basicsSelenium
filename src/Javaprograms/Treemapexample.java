package Javaprograms;

import java.util.TreeMap;

public class Treemapexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(2, "Fremont");
		tm.put(1, "pennsylvania");
		tm.put(3, "ohio");
		tm.put(4, "califormaia");
		tm.put(4, "washington");// gets replaced by new value
		tm.put(5, "ohio");
		System.out.println(tm);
		
	}

}
