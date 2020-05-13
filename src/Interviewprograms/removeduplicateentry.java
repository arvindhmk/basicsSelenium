package Interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class removeduplicateentry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		Integer a[] = {1,1,1,1,2,3,3,3};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.println(al);
		
		HashSet<Integer> hs = new HashSet<Integer>(al);
		
		
		System.out.println(hs);
		
		
		
		
	}

}
