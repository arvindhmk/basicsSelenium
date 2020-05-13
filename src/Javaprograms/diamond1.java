package Javaprograms;

public class diamond1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("   1");
		System.out.println("  212");
		System.out.println(" 32123");
		System.out.println("4321234");
		System.out.println(" 32123");
		System.out.println("  212");
		System.out.println("   1");
		System.out.println("---------------------");
		
		
		int i,j;
		int nocol=1;
		int start = 0;
		int numofspace =3;
		
		for(i=1;i<=7;i++)
		{
			
			for(j=1;j<=numofspace;j++)
			{
				System.out.print(" ");
			}
			
			
			if(i<4)
			{
				start=i;
				numofspace--;
			}
			else
			{
				start=8-i;
				numofspace++;
			}
									
			for(j=1;j<=nocol;j++)
			{
				
				int mid=nocol/2+1;
				System.out.print(start);
				if(j<mid)
				{
					start--;
				}
				else
				{
					start++;
				}	
			}
			//nocol=nocol+2;
			System.out.println();
			 
			if(i<4)
			{
				nocol=nocol+2;
			}
			else
			{
				nocol=nocol-2;
			}
		}
		
	}

}
