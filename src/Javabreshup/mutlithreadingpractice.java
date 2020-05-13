package Javabreshup;


//class Mytask
//{
//	void executemytask() 
//	{
//	
//		for(int doc=0;doc<=10;doc++)
//		{
//			System.out.println("@printing docs"+doc+"-Printer 2 ");
//		}
//	}
//}

class CA
{
	
}


class Mytask extends CA implements Runnable
{
//Job3
	public void run()
	{
		for(int doc=0;doc<=10;doc++)
		{
			System.out.println("@printing docs"+doc+"-Printer 2 ");
		}
	}
}

public class mutlithreadingpractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Job1
		System.out.println("Application started");
		
		
		//Mytask task = new Mytask();//Child Thread or Worker thread
		//task.executemytask();
		Runnable r = new Mytask();
		Thread task = new Thread(r);
		task.start();
		
		
		//task.start();
		//Job 2 and Job 3 runs concurrently or parallely
		//Job3
		for(int doc=0;doc<=10;doc++)
		{
			System.out.println("#printing docs"+doc+"-Printer 1");
		}
		
		//Job4
		System.out.println("Application ended");
	}

}
