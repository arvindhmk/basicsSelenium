package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class checkstringhasuniquechar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String str = "ARVINDH";
		int length = str.length();
		
		char[] st=str.toCharArray();
		
		Map<Character,Integer> hmp = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<length;i++)
		{
			if(hmp.containsKey(st[i])==false)
			{
				hmp.put(st[i], 1);
			}
			else
			{
				int oldval=hmp.get(st[i]);
				int newval= oldval+1;
				hmp.put(st[i],newval);
			}
		}
		
	Set<Map.Entry<Character,Integer>> mp = hmp.entrySet();
	
			for(Map.Entry<Character,Integer> data : mp)
			{
				if(data.getValue()>1)
				{
					System.out.println("String does not contain unique values");
					System.exit(0);
				}
			}
			System.out.println("String contains unique values");
		
		
	}

}
