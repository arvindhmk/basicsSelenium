package Javaprograms;

public class Prime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	int pNum=30;
	boolean isPrime=true;
	
	//System.out.println((int)Math.sqrt(pNum));
	for(int i=2;i<Math.sqrt(pNum);i++)
	{
		if(pNum % i == 0)
		{
			isPrime=false;
			break;
		}
	}
		if(isPrime)
		{
			System.out.println("Given number is prime ");
		}
		else
		{
			System.out.println("Given number is not prime ");
		}
	}
}
