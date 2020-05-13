package Javaprograms;

import java.util.HashMap;

public class Hashmapexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		
		mp.put(3, "Maruti");
		mp.put(2, "Suzuki");
		mp.put(5, "Bolero");
		mp.put(4, "Jaquer");
		mp.put(1, "Swift");
		mp.put(1, "etios");//will get replaced
		
		//System.out.println(mp);
		HashMap<Integer,String> mpduplicate = new HashMap<Integer,String>();
		mpduplicate.putAll(mp);
		System.out.println(mpduplicate);
		mpduplicate.clear();
		System.out.println(mpduplicate);
		
		System.out.println(mp.containsKey(5));
		System.out.println(mp.containsValue("Swift"));
		
		System.out.println(mpduplicate.isEmpty());
		
		
		System.out.println(mp.keySet());
		
		System.out.println(mp.values());

		System.out.println(mp.entrySet());
		System.out.println(mp.get(1));
		
		
		
		
		
	}

}
