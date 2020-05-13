package Interviewprograms;

public class reversesentence 
{
	
	public void reversesen()
	{
		String s1="i love sai rishvanth";
		
				
		String[] arr=s1.split("\\s");
		
		int len=arr.length;
		
		System.out.println(len);
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reversesentence sen = new reversesentence();
		sen.reversesen();
	}

}
