package Javaprograms;

public class Array_Largenum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arrVal[] = {56,88,33,99,45,22};
		
		//print array values
		
		for(int i=0;i<arrVal.length;i++)
		{
			System.out.println(arrVal[i]);
		}
		int largest=arrVal[0];
		for(int i=1;i<arrVal.length;i++)
		{
			
			if(arrVal[i]>largest)
			{
				largest=arrVal[i];
			}
		}
		System.out.println("Largest of array "+largest);
	}

}
