package Practice;

public class primenum 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub

		int num = 43;
		
		Boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number ia not prime");
		}
	}

}
