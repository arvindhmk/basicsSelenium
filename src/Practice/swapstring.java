package Practice;

public class swapstring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String d1="kodai";
		String d2="kanal";
		
		System.out.println("Before swapping =="+ d1);
		System.out.println("Before swapping =="+ d2);
		
		
		d1=d1+d2;
		
		d2=d1.substring(0, d1.length()-d2.length());
		
		d1=d1.substring(d2.length());
		
		System.out.println("After swapping =="+ d1);
		System.out.println("After swapping =="+ d2);
		
		
	}

}
