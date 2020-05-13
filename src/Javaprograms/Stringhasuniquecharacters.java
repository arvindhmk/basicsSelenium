package Javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Stringhasuniquecharacters 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="sspider";
		//String s2="spider";
		
		char[] y=s1.toCharArray();
		int length = s1.length();
		
		Map<Character,Integer> lmp = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<length;i++)
		{
			if(lmp.containsKey(y[i])==false)
			{
				lmp.put(y[i], 1);
			}
			else
			{
				int oldval= lmp.get(y[i]);
				int newval=oldval+1;
				lmp.put(y[i], newval);
			}
		}
		
		Set<Map.Entry<Character,Integer>> smp=lmp.entrySet();
		
		for(Map.Entry<Character, Integer> data: smp)
		{
			if(data.getValue()>1)
			{
				System.out.println("string has no unique characters");
				//System.out.println(data.getKey());
				//System.out.println(data.getValue());
				break;//System.exit(0);
			}
			else
			{
				System.out.println("string has unique characters");
				//System.out.println(data.getKey());
				//System.out.println(data.getValue());
				break;
			}
		}
		
	}

}