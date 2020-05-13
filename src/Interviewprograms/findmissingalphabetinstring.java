package Interviewprograms;

import java.util.Arrays;
import java.util.HashSet;



public class findmissingalphabetinstring 
{

	public void missingalphabet()
	{
		String a1 ="abcd";
		String[] a1arr = a1.split("");
		
		String a2 = "efghijklmnopqrstuvwxyz";
		String[] a2arr = a2.split("");
		
		HashSet<String> s1 = new HashSet<String>(Arrays.asList(a1arr));

		HashSet<String> s2 = new HashSet<String>(Arrays.asList(a2arr));
		
		s2.removeAll(s1);
		
		System.out.println("missing alphabets "+ s2);
		
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		findmissingalphabetinstring alpha = new findmissingalphabetinstring();
		alpha.missingalphabet();
	}

}
