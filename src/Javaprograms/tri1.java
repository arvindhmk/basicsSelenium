package Javaprograms;

public class tri1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("    1");
		System.out.println("   2 2");
		System.out.println("  3 3 3");
		System.out.println(" 4 4 4 4");
		System.out.println("5 5 5 5 5");
		
		int i,j,k,size=5;
		int numOfspaces=size-1;
		
		for(i=1;i<=size;i++)
		{
			for(k=numOfspaces;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");	
			}
			System.out.println();
			numOfspaces--;
		}
		
		
	}

}
