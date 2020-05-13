package Javaprograms;

public class Palindromewithnumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num=101;
		int reversevalue=0;
		int originalvalue=num;
		int remainder;
		
		while(num>0)
		{
			remainder=num%10;
			reversevalue = (reversevalue*10)+remainder;
			num=num/10;
		}
		
		if(originalvalue==reversevalue)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
		
	}

}
