package Interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findsmallvalinarray 
{
	Integer[] arr= {3,2,9,5,4};
	
	public void findsmall()
	{	
		int small=Integer.MAX_VALUE; //2^31-1
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	
	System.out.println("smallest value "+small);
	
	}

	public void findsmall2()
	{
		Arrays.sort(arr);
		
		System.out.println("small num = "+arr[0]);
		
	}
	
	public void usingcollections()
	{
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for(Integer values : arr)
		{
			alist.add(values);
		}
		
		Collections.sort(alist);
		
		System.out.println("smallest num ="+alist.get(0));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		findsmallvalinarray find = new findsmallvalinarray();
		//find.findsmall();
		//find.findsmall2();
		find.usingcollections();
	}

}
