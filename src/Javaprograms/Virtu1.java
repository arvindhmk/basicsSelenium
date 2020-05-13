package Javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Virtu1 
{
//find duplicate characters in given string
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Map<Character,Integer> mp = new HashMap<Character, Integer>();
		
		String s1="madurai";

		char[] y = s1.toCharArray();
		
		int i=0;
		int length=s1.length();
		
		while(i!=length)
		{
			if(mp.containsKey(y[i])==false)
			{
				mp.put(y[i], 1);
			
			}
			else
			{
				int oldvalue =mp.get(y[i]);
				int newvalue=oldvalue+1;
				mp.put(y[i], newvalue);
			}i++;
			
		}
		
		
		
		
		Set<Map.Entry<Character,Integer>>hmap = mp.entrySet();
		
		for(Map.Entry<Character,Integer>data : hmap)
		{
			if(data.getValue()>1)
			{
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
}
	
}
}