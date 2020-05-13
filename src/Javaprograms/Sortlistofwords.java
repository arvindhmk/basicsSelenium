package Javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Sortlistofwords 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Strings");
		
		String[] arr = new String[5];
		
		for(int i=0;i<5;i++)
			
		{
			arr[i]=input.nextLine();
			
		}
		
		Arrays.sort(arr);
		
		for(int j=0;j<5;j++)
		{
			System.out.println(arr[j]);
		}
		
	}

}
