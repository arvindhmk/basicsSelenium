package Javaprograms;

public class trianglewithnumbers 
{

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub

//	  1
//   121
//  12321
// 1234321
	
		int odd=1;
		int numofspace=3;
		for(int i=1;i<=4;i++)
	{		
		int k=0;
		for(int j=1;j<=numofspace;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=odd;j++)
		{
			if(j<=i)
				
			{
				k=k+1;
			}
			
			else
			{
				k=k-1;
			}
			System.out.print(j);
		}
		odd=odd+2;
		System.out.println();
		numofspace--;
	}
		
		
	}

}
