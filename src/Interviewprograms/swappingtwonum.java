package Interviewprograms;

public class swappingtwonum
{
	
	//usingtempvariable
	
	
	public void usingtempvar()
	{
		int a=20,b=50;
		
		System.out.println("Values before swapping a and b "+a+" and "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values after swapping a and b "+a+" and "+b);
		
		
	}
	
	public void withoutusingtemp()
	
	{
	
		int first=20,second=50;
		
		System.out.println("Values before swapping first and second "+first+" and "+second);
		/*
		 * first=first-second;//20-50=-30 
		 * second=first+second;//-30+50=20
		 * first=second-first;//20+30
		 */		
		
		first=first*second;//1000
		second=first/second;//20
		first=first/second;//50
		
		
		System.out.println("Values before swapping first and second "+first+" and "+second);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		swappingtwonum swap = new swappingtwonum();
		//swap.usingtempvar();
		swap.withoutusingtemp();
	}

}
