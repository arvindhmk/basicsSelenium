package Interviewprograms;

public class findalphabetposition 
{
	
	public void position()
	{
		
		char ch='A';
		char ch1='a';
		
		//ASCII value A==65 a==97
		
		
		int asciival = (int)ch;
		int asciival1=(int)ch1;
		
		System.out.println(asciival);
		System.out.println(asciival1);
		
		
		int pos= asciival-64;
		int pos1= asciival1-96;
		
		System.out.println("A==>"+pos);
		System.out.println("a==>"+pos1);
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		findalphabetposition posi = new findalphabetposition();
		posi.position();
	}

}
