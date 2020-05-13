package Javaprograms;

public class substingex {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub

		String s="Lets learn substring";
		
		String s1=s.substring(10);//inclusive of 10
		System.out.println(s1);
		String s2=s.substring(5, 10);//exclusive of 10
		System.out.println(s2);		
		CharSequence s3=s.subSequence(0, 4);
		System.out.println(s3);
		
	}

}
