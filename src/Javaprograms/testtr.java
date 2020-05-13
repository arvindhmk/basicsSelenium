package Javaprograms;

public class testtr 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

//		   1
//		   123
//		  12345
//		 1234567
		
		int odd=1;
		//int k=0;
		int numofspace=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=numofspace;j++)
			{
				System.out.print(" ");
			}
			//numofspace--;
			int k=0;
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
				
				System.out.print(k);
			}
			System.out.println("");
			odd=odd+2;
			numofspace--;
		}
	}

}
