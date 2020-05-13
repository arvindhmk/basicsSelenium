package Javabreshup;

public class superkeywordexample 
{
	
public static void main(String[] args)
{
	B obj= new B("hai");
//	obj.add();
	
}
}
	
class A
{

	public A() 
	{
	
		System.out.println("in class A");
	}
	public A(int a)
	{
		System.out.println("A with param");
	}
	
	public void add()
	{
		System.out.println("ADD method called");
	}
}

class B extends A
{
	public B() 
	{
	
		System.out.println("in class B");
	}
	public B(int b)
	{

		System.out.println("B with param");
	}
	
	public B(String s1)
	{

		System.out.println("B with param");
	}
}
