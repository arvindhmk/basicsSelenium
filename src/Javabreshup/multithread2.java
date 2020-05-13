package Javabreshup;

class printer
{
//	synchronized 
	void printdocuments(int numOfcopies, String docName)
	{
		for(int i=0;i<=numOfcopies;i++)
		{
			System.out.println(">>Printing " +docName+ i);
		}
	}
}

class myThread extends Thread
{
	printer pRef;
	
	myThread(printer p)
	{
		pRef=p;
	}
	
	public void run()
	{
		synchronized(pRef) 
		{
		
		pRef.printdocuments(10, "johns profile");
	}
}
}	

class yourThread extends Thread
{
	printer pRef;
	
	yourThread(printer p)
	{
		pRef=p;
	}
	
	public void run()
	{
		synchronized(pRef)
		{
		pRef.printdocuments(10, "marias profile");
	}
}
}


public class multithread2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("==Application started==");
		
		printer p = new printer();
		myThread mRef = new myThread(p);		
		yourThread yourRef = new yourThread(p);
		
		
		yourRef.start();
//		try {
//			yourRef.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		mRef.start();
		
		System.out.println("==Application finished==");
	}

}
