package Interviewprograms;

public class findlengthwithoutfunction 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="sai rishvanth";
		int length=0;
		char[] s1arr= s1.toCharArray();
		
		for(char ch:s1arr)
		{
			length++;
		}
		System.out.println(length);
	}

}
