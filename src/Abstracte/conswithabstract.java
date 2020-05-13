package Abstracte;

abstract class Base
{
	Base()
	{
		System.out.println("Base class constructor");
	}
	abstract int Test();
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class constructor");
	}
	int Test()
	{
		System.out.println("abstract class implemented");
		return 0;
	}
}
public class conswithabstract 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Derived d = new Derived();
		
	}
}