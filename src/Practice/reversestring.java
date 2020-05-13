package Practice;

public class reversestring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s1="Hello how are you?";
		//String s1="ABC tech";
		String reverse="";
		
		char[] str1=s1.toCharArray();
		
		int size=str1.length;
		
		for(int i=size-1;i>=0;i--)
		{
			reverse=reverse+str1[i];
		}
		
		System.out.println("Reversed string==>"+reverse);
		
	}

}
