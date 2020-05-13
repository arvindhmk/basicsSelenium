package Javaprograms;

public class Reversestring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String inputstring = "Rishvanth";
		char ch[] = inputstring.toCharArray();
		int length = ch.length;
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}

}
