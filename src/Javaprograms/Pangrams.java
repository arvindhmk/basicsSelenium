package Javaprograms;

public class Pangrams {
//string has all the 26 alphabets in the string
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		//String pan="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		String pan="MY NAME IS KHAN";
		pan=pan.replaceAll(" ","");
		
		char[] ar=pan.toCharArray();
		int size= ar.length;
		
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				
		
		for(int i=0;i<size;i++)
		{
			int index= ar[i]-65;
			a[index]=1;			
		}
		
		for(int i=0;i<26;i++)
		{
			if(a[i]!=1)
			{
				System.out.println("The given string is not pangram");
				System.exit(0);
			}
		}
		System.out.println("The string is pangram");
	}

}
