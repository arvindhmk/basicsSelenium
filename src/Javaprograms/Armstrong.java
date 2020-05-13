package Javaprograms;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int number = 153;
		int cubeValue;
		int amsNum=0;
		int temp = number;

		while(number>0)
		{
		int v1=number%10;
		cubeValue=(int) Math.pow(v1, 3);
		number=number/10;
		amsNum=amsNum+cubeValue;
		}
		System.out.println(amsNum);
		
		if(temp==amsNum)
		{
			System.out.println("Given Number is Amstrong");
		}
		else
		{
			System.out.println("Given Number is not Amstrong");
		}
		
	}

}
