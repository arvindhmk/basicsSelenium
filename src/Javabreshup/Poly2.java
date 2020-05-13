package Javabreshup;
//When you defines a static method with same signature as a static method in base class, it is known as method hiding.
public class Poly2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		fb f = new fb();
		f.display();
		f.show();
		
		fb g = new gmail();
		g.display();
		g.show();
	}

}

class fb
{
	public static void show()
	{
		System.out.println("parent static method == overriden");
	}
	
	public void display()
	{
		System.out.println("parent non static method == overriden");
	}
}

class gmail extends fb
{
	public static void show()
	{
		System.out.println("child static method = override");
	}
	
	public void display()
	{
		System.out.println("child non static method == override");
	}
}