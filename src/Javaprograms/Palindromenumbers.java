package Javaprograms;

public class Palindromenumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		    int num=1001;
	        int reverseValue=0;
	        int remainder;
	        int originalValue=num;

	        while(num>0)
	        {
	            remainder=num%10;//Mod
	            reverseValue=reverseValue*10+remainder;//multilpy 10 n add remainder
	            num=num/10;//divide by 10
	        }
	        if(originalValue==reverseValue)
	        {
	            System.out.println("The number is palindrome");
	        }else
	        {
	            System.out.println("Number is not palindrome");
	        }

	    }

	}