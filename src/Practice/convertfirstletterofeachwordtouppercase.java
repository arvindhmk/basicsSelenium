package Practice;

public class convertfirstletterofeachwordtouppercase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String country="i love my india";
		
		char[] countarray= country.toCharArray();
		
		countarray[0]=(char)(countarray[0]-32);
		
		for(int i=1;i<countarray.length;i++)
		{
			if(countarray[i]==' ')
			{
				countarray[i+1] = (char) (countarray[i+1]-32);
			}
		}
		
		System.out.println(countarray);
		
	}

}
