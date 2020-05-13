
public class Demo 
{

	public void Max(int a, int b, int c)
	{
		if((a>b)&&(a>c))
		{
			System.out.println("Max number "+a);
		}
		if((b>c)&&(b>a))
		{
			System.out.println("Max number "+b);
		}
		else
		{
			System.out.println("Max number "+c);
		}
		
	}
	
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		Demo d=new Demo();
		d.Max(100, 459, 933);
		
		
	}

}
