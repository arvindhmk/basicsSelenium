package Javaprograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maxoccuringcharinstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="GOD_BLESS_SPIDERMAN";
		
		char[] ch = s1.toCharArray();
		
		
		
	LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();

	for(int i=0;i<s1.length();i++)
	{
		if(lhm.containsKey(ch[i])==false)
		{
			lhm.put(ch[i], 1);
		}
		else
		{
			int oldval=lhm.get(ch[i]);
			int newval=oldval+1;
			lhm.put(ch[i], newval);
		}
	}
	
	char maxkey=' ';
	int maxvalue=0;
	
	Set<Map.Entry<Character,Integer>>lhs=lhm.entrySet();
	
	for(Map.Entry<Character, Integer> data: lhs)
	{
		if(data.getValue()>maxvalue)
		{
		maxkey=data.getKey();
		maxvalue=data.getValue();
		}
		
	}
	System.out.println(maxkey);
	System.out.println(maxvalue);
	}

}
