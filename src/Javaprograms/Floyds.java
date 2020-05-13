package Javaprograms;

public class Floyds 
{
	static void triangle(int n)
	{
		int value=1;
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(value+" ");
				value++;
			}
			
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		triangle(5);
	}

}
