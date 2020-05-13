package Interviewprograms;

public class maveric 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Java program to demonstrate 
		// control flow of try-catch clause 
		// when exception occur in try block 
		// and handled in catch block 
				
				// array of size 4. 
				int[] arr = new int[4]; 
				try
				{ 
					int i = arr[4]; 
						
					// this statement will never execute 
					// as exception is raised by above statement 
					System.out.println("Inside try block"); 
				} 
				catch(ArrayIndexOutOfBoundsException ex) 
				{ 
					System.out.println("Exception caught in Catch block"); 
				} 
				
				// rest program will be excuted 
				System.out.println("Outside try-catch clause"); 
			} 
 

	}


