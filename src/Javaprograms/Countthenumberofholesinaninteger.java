package Javaprograms;

public class Countthenumberofholesinaninteger 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] hole= {1, 0, 0, 0, 1, 0, 1, 0, 2, 1};
		
		int input=6457819;
		int holes=0;
		while(input>0)
		{
		int num=input%10;
		
		holes = holes+hole[num];
		
		input=input/10;
		}
		
		System.out.println("sum of integers:"+holes);
	}

}
