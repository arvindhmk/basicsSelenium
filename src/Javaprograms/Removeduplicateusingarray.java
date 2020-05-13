package Javaprograms;

import java.util.Arrays;

public class Removeduplicateusingarray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] arr = {2,6,4,7,6,7,9,2,3,9};
		
		int[] temp = new int[arr.length];	
		Arrays.sort(arr);
		
		for(int k=0;k<arr.length-1;k++)
		{
		System.out.println("sorted values"+arr[k]+" ");
		}
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
			
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}	
		}
		
		System.out.println("---------------------");
		temp[j]=arr.length-1;
		
		for(int k=0;k<=j;k++)
		{
		System.out.println("unique values"+temp[k]+" ");
		}
	}

}
