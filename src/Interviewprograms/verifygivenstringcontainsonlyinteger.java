package Interviewprograms;

public class verifygivenstringcontainsonlyinteger {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Boolean status = true;
		String strint ="2326";
		
		for(int i=0;i<strint.length();i++)
		{
			if(!(strint.charAt(i)>='0' && strint.charAt(i)<='9'))
			{
				
				status = false;
				break;
			}

		}
		if(status)
		{
			System.out.println("String has only integers value");
		}
		else
		{
			System.out.println("string has non integer values");
		}
		
	}

}
