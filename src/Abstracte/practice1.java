package Abstracte;

public abstract class practice1 

{

final void m1() 
{
	System.out.println("m1 called");
}
 
}
class p2 extends practice1
{

	public static void main(String args[])
	{
		practice1 p1 = new p2();
		p1.m1();
	}

}