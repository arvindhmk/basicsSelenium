package interfc;

public class Anonymou
{
	
		
	public void m6() 
	{
		System.out.println("M6 cleared");
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Anonymou obj1 = new Anonymou();
//		Anonyinter obj = new Anonyinter()  //Anonymous inner class
//				{
//			public void m1()
//			{
//				System.out.println("M1");
//			}
//				};
		
		Anonyinter obj = ()->System.out.println("m1"); //if interface have only one method
		
				obj.m1();
				obj1.m6();
	}

}
