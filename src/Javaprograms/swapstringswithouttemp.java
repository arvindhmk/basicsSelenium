package Javaprograms;

public class swapstringswithouttemp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str1="hai";
		String str2="hello";
		
		System.out.println("Values of str1 and str2 before swapping ==>"+str1+" "+str2);
		
		//append both strings
		
		str1=str1+str2;
		System.out.println("str1 value "+str1);
		
		str2=str1.substring(0, str1.length()-str2.length());//0,8-5=3
		str1= str1.substring(str2.length());
		
		System.out.println("Values of str1 and str2 before swapping ==>"+str1+" "+str2);
	}

}
