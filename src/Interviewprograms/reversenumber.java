package Interviewprograms;

public class reversenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int number=987654321;
		
		int reversenum=0;
		
		while(number!=0)
		{
		int num = number%10;
		reversenum=reversenum*10+num;
		number=number/10;
		}
		
		System.out.println(reversenum);
		
	}

}
