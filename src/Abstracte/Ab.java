package Abstracte;

public abstract class Ab 
{
	final void m1()
	{
		System.out.println("final method called");
	}
	
	public static void main(String args[])
	{
		Ab ob = new Ab3();
		ob.m1();
		Ab3 ob1 = new Ab3();
		ob1.display();
		ob1.show();
}
}
abstract class Ab2 extends Ab
{
	public abstract void show();

public void display()
{
	System.out.println("display method called");
}
}
class Ab3 extends Ab2
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}
	public void display() 
	{
	System.out.println("overridden");	
	}
	

}