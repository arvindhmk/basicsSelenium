package Interviewprograms;

public class printfloydstriangle {

	public void floyd()
	{
		int row,col=0;
		
		int size=8;

		int num=1;				
		for(row=0;row<size;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		printfloydstriangle trian = new printfloydstriangle();
		trian.floyd();
	}

}
