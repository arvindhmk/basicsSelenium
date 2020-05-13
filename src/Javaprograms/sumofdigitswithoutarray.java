package Javaprograms;

public class sumofdigitswithoutarray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num=100;
		int sum=0;
		
		while(num!=0)
		{
		int i=num%10;
		sum= sum+i;
		num=num/10;
		}
		System.out.println(sum);
	}

}
