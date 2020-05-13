package Javaprograms;

public class inversepyramid {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println(" 1 2 3 4 5");
		System.out.println("  1 2 3 4");
		System.out.println("   1 2 3");
		System.out.println("    1 2");
		System.out.println("     1");
		System.out.println("--------------------------");

		int i,j;
		int numofspace=5;
		for( i=5;i>=1;i--)
		{
			for(int k=5;k<=numofspace;k++)
			{
				System.out.print(" ");
			}
			numofspace++;
			
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			
			
			
		}
		
	}

}
