package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class maximunoccurinchar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="SILLYSPIDERS";
		
		int length=s1.length();
		
		char[] s1ch=s1.toCharArray();
		
		Map<Character,Integer> llmp = new LinkedHashMap<Character,Integer>();

		for(int i=0;i<length;i++)
		{
			if(llmp.containsKey(s1ch[i])==false)
			{
				llmp.put(s1ch[i], 1);
			}
			else
			{
				int oldval=llmp.get(s1ch[i]);
				int newval=oldval+1;
				llmp.put(s1ch[i], newval);
			}
		}
		
		Set<Map.Entry<Character,Integer>> chara =llmp.entrySet();
		char maxkey=' ';
		int maxval=0;
		for(Map.Entry<Character, Integer> data:chara)
		{
			 
			 if(data.getValue()>maxval)
			 {
				 maxval=data.getValue();
				 maxkey = data.getKey();
				 
			 }
			 
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}

}
