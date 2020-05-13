package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class printalloccurenceofword 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String word = "Selenium automate is may or may not support automate web application";
		
		String[] wrd = word.split("\\s");
		
		int length = wrd.length;
		
		Map<String,Integer> wrdocur = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<length;i++)
		{
			if(wrdocur.containsKey(wrd[i])==false)
			{
				wrdocur.put(wrd[i], 1);
				
			}
			else
			{
				int oldval=wrdocur.get(wrd[i]);
				int newval=oldval+1;
				wrdocur.put(wrd[i],newval);
			}
		}
	
		System.out.println(wrdocur);
		
//	Set<Map.Entry<String,Integer>> w=wrdocur.entrySet();
//	
//	for(Map.Entry<String, Integer> data : w)
//	{
//		System.out.println(data.getKey());
//		System.out.println(data.getValue());
//	}
//		
//		
}

}
