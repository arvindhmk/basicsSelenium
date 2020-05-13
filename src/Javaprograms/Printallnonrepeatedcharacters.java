package Javaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Printallnonrepeatedcharacters 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="SILLYSPIDERS";
		char[] ch= s1.toCharArray();
		
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(hm.containsKey(ch[i])==false)
			{
				hm.put(ch[i], 1);
			}
			else
			{
				int oldval=hm.get(ch[i]);
				int newval=oldval+1;
				hm.put(ch[i], newval);
			}
		}
		

		Set<Map.Entry<Character, Integer>> shm = hm.entrySet();
		  
		for(Map.Entry<Character, Integer> data:shm)
		{
			if(data.getValue()==1)
			{
				System.out.println("Non reprated values "+ data.getKey());
			}
		}
		
	}

}
