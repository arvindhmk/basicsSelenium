package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class syncarraylist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//non synchronized list
		List<String> nonli = new ArrayList<String>();
		nonli.add("hello");
		System.out.println("non sync"+nonli);
		
		List<String> syncli = Collections.synchronizedList(nonli);
		System.out.println("sync"+syncli);
		
		
		Set<String> nons = new HashSet<String>();
		nons.add("hai");
		System.out.println("non sync"+nons);
		
		Set<String> syncset = Collections.synchronizedSet(nons);
		System.out.println("sync"+syncset);
		
		
		Map<String,Integer> nonmap = new HashMap<String,Integer>();
		nonmap.put("key1", 1);
		System.out.println("non sync"+nonmap);
		
		Map<String,Integer> syncmap = Collections.synchronizedMap(nonmap);
		System.out.println("sync"+syncmap);
		
		}

}
