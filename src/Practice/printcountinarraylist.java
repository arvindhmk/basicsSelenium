package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class printcountinarraylist 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<String>(Arrays.asList("ab","ab","bb","cc","dd","ee","aa","bb"));
		

		Set<String> uniqueset = new HashSet<String>(li);
		
		for(String temp : uniqueset)
		{
			System.out.println(temp+":"+Collections.frequency(li, temp));
		}
		
		
}
}
