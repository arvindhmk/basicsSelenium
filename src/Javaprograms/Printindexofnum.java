package Javaprograms;

import java.util.Scanner;

public class Printindexofnum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num[]= {1,4,5,7,9};
		int desirednum;
		Scanner input = new Scanner(System.in);
		System.out.println("enter desired num");
		desirednum=input.nextInt();
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			if(num[i]==desirednum)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
