package Javaprograms;

public class verifystringcontainsonlyintegers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String st1="12b32";
		//char ch[]=st1.toCharArray();
		
		for(int i=0;i<st1.length();i++)
		{
			if(Character.isAlphabetic(st1.charAt(i)))
			{
				System.out.println("The given string contains alphabets");
				System.exit(0);
			}
		}
		System.out.println("The given string contains only integers");
	}

}
