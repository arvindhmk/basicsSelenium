package Javaprograms;

import java.util.Scanner;

public class Reversepattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num_Lines;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		num_Lines=input.nextInt();
		for(int i=num_Lines;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
