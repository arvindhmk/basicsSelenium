package Practice;

public class removewhitespacefromstring2 
{

	
	public void removewhitespace(String str)
	{
		
		str=str.replaceAll("\\s","");
		System.out.println(str);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		removewhitespacefromstring2 rmwhite = new removewhitespacefromstring2();
		rmwhite.removewhitespace("Rishvanth is	good boy");
		
		
	}

}
