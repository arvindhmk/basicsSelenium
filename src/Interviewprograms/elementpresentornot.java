package Interviewprograms;

import java.util.stream.IntStream;

public class elementpresentornot 
{
	int[] arr= {34,66,2,23,87,11};
	
	int numbertofind=11;
	public void elementpresent()
	{
		
		boolean found = false;
		
		for(int value:arr)
		{
			if(value==numbertofind)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Value is present");
			
		}else
		{
			System.out.println("Value not present");
		}
		
	}
	
	
	public void usingstream()
	{
		boolean found = IntStream.of(arr).anyMatch(element->element==numbertofind);
		
		if(found)
		{
			System.out.println("Value is present");
		}
		else
		{
			System.out.println("Value not present");
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		elementpresentornot ele= new elementpresentornot();
		//ele.elementpresent();
		ele.usingstream();
}
}