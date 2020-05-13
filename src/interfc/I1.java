package interfc;

public interface I1 
{

	default int show(int n)
	{
		System.out.println("show method from I1");
		System.out.println(n);
		return n;
	}
	
	static boolean show1(boolean status)
	{
		System.out.println("static method");
		return status;
	}
}
