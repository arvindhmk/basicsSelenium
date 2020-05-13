package Javabreshup;

public class Poly 
{public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//parent p = new parent();
	//p.parentmethod();
	parent c = new child();
	//c.childmethod();
	c.parentmethod(5);
	c.parentmethod2();
	//child c1= new child();
	//c1.childmethod();
	//c1.parentmethod();
}

}
	class parent
	{
		public int parentmethod(int a) {
		System.out.println("parent method "+a);
		return a;	
		}
		public void parentmethod2() {
			System.out.println("parent method not overriding");	
			}
		
	}
	
	class child extends parent
	{
		public void childmethod()
		{
			System.out.println("child method");
		}
		
		public int parentmethod(int a)
		{
			System.out.println("parentmethod from child class == override "+a);
			return a;
		}
	}
	