package Interviewprograms;

public class diamond {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*
		 * 1 
		 *212 
		 32123 
		4321234 
		 32123 
		  212 
		   1
		 */
		
int limit =7;
int start=0;
int numofcol=1;
int numofspace=3;
int i,j;
for(i=1;i<=limit;i++)
{
	if(i<4)
	{
		start=i;
	}
	else
	{
		start=8-i;
	}
	
	for(j=0;j<numofspace;j++)
	{
		System.out.print(" ");
	}
	if(i<4)
	{
	numofspace--;
	}
	else
	{
		numofspace++;		
	}
	for(j=1;j<=numofcol;j++)
	{
		
		int midcol=numofcol/2+1;
		System.out.print(start);
		if(j<midcol)
		{
			start--;
		}
		else
		{
			start++;
		}
		
	}
	System.out.println();
	if(i<4)
	{
		numofcol=numofcol+2;	
	}
	else
	{
		numofcol=numofcol-2;
	}
	
}
			
	}

}
