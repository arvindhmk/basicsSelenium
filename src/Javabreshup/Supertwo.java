package Javabreshup;

public class Supertwo extends Superone
{
	String name="Rishvanth";
	
	public Supertwo()
	{
		super();//this should be always the first line, if super keyword is also not specified it will call parent constructor
		System.out.println("child constructor");
		
	}
	
	
	public void stringdata()
	{
		System.out.println(name);
		System.out.println(super.name);//pointing to parent class
	}
	
	public void method()
	{
		super.method();//pointing to parent class method
		System.out.println("child method");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Supertwo s = new Supertwo();
		s.stringdata();
		s.method();
		
	}

}
