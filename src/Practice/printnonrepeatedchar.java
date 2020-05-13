package Practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class printnonrepeatedchar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String strin = "VENKATRAMAN";
		
		int length = strin.length();
		
		char[] s = strin.toCharArray();
		
		
		Map<Character,Integer> mp = new TreeMap<Character,Integer>();
				
		for(int i=0;i<length;i++)
		{
			if(mp.containsKey(s[i])==false)
			{
				mp.put(s[i], 1);
				
			}
			else
			{
				int oldval=mp.get(s[i]);
				int newval=oldval+1;
				mp.put(s[i], newval);
			}
		}
		
		Set<Map.Entry<Character,Integer>> chars=mp.entrySet();
		
		for(Map.Entry<Character, Integer> data:chars)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
			}
		}
		
	}

}
