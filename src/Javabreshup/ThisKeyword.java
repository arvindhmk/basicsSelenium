package Javabreshup;

public class ThisKeyword 
{
	int a=5;
	public void sum()
	{
		int a=15;
		int b=this.a;// this keyword points to instance variable or global variable
		
		System.out.println("Sum = "+(a+b));
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThisKeyword th = new ThisKeyword();
		th.sum();
		
	}

}
