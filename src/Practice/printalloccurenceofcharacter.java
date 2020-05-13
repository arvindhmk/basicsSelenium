package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printalloccurenceofcharacter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String name = "SAIRISHVANTH";
		
		int length = name.length();
		
		char[] n = name.toCharArray();
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
				
		for(int i=0;i<length;i++)
		{
			if(mp.containsKey(n[i])==false)
			{
				mp.put(n[i], 1);
			}
			else
			{
				int oldval=mp.get(n[i]);
				int newval=oldval+1;
				mp.put(n[i], newval);
			}
			
			System.out.println(mp);
//			
//			Set<Map.Entry<Character,Integer>> smp=mp.entrySet();
//					for(Map.Entry<Character,Integer> data:smp)
//					{
//						System.out.print(data.getValue());
//					}
		}
		
	}

}
