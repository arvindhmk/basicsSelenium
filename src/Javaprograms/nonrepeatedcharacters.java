package Javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class nonrepeatedcharacters 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str = "SILLYSPIDERS";
		
		char[] strch = str.toCharArray();
		
		int len = str.length();
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(mp.containsKey(strch[i])==false)
			{
				mp.put(strch[i], 1);
			}
			else
			{
				int oldval = mp.get(strch[i]);
				int newval = oldval+1;
				mp.put(strch[i], newval);
			}
		}
			
		Set<Map.Entry<Character, Integer>> smp =mp.entrySet();
		
		for(Map.Entry<Character, Integer> data : smp)
{
	if(data.getValue()==1)
	{
		System.out.println(data.getKey());
	}
}
		
		}
		
	}

