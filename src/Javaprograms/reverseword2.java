package Javaprograms;

public class reverseword2 
{

	
	//iarudam ni mI
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str="Im in madurai";
		
		String reverse="";
		
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse= reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		
		
	}

}
