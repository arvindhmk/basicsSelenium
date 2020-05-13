package Javaprograms;

import java.util.Scanner;

public class primenumberaliter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number to check Prime or not");
		
		int prime = input.nextInt();
		
		for(int i=2;i<Math.sqrt(prime);i++)
		{
			if(prime%i==0)
			{
				System.out.println("The given number is not prime");
				break;
			}
			else
			{
				System.out.println("The given number is prime");
				break;
			}
		}
		
		
	} 

}
