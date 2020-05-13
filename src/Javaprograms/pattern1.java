package Javaprograms;

import java.util.Scanner;

public class pattern1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int number_Lines;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		number_Lines=input.nextInt();
		
		for(int i=1;i<=number_Lines;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}
