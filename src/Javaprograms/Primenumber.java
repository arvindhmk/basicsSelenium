package Javaprograms;

public class Primenumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numPrime=53;
	      boolean isPrime = true;
	      for (int i=2;i<=Math.sqrt(numPrime);i++)
	      {
	          if (numPrime % i == 0)
	          {
	              isPrime = false;
	              break;
	          }
	      }
	          if (isPrime)
	          {
	              System.out.println("Given number is Prime");
	          }else
	          {
	              System.out.println("Given number is not Prime");

	}
	}
}
