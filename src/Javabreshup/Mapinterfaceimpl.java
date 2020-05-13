package Javabreshup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Hash Map
public class Mapinterfaceimpl 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Map<Integer,String> hmp = new HashMap<Integer,String>();//key n value
		hmp.put(0,"Zero");
		hmp.put(1,"One");
		hmp.put(2,"Two");
		hmp.put(4, null);
		hmp.put(5, null);
		hmp.put(null, "test");
		hmp.put(null, "testnull");
		System.out.println(hmp.get(0));
		System.out.println(hmp.containsKey(3));
		System.out.println(hmp.containsValue("Two"));
		hmp.putIfAbsent(3, "Three");
		//System.out.println(hmp.g);
		System.out.println(hmp.get(null));
		Set smp = hmp.entrySet();
		
		Iterator values = smp.iterator();
		
		while(values.hasNext())
		{
			Map.Entry me = (Map.Entry)values.next();
			//System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
		
	}

}
