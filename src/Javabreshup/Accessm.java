package Javabreshup;

public class Accessm extends accessprivate
{
	protected int var=2;
	protected void add1()// uses Default access modifiers
	{
		System.out.println("add method");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		accessprivate ap = new accessprivate();
		Accessm m = new Accessm();
	
		ap.add();
		System.out.println(m.var);
	}

}
