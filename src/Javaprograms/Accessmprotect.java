package Javaprograms;
import Javabreshup.Accessm;

public class Accessmprotect extends Accessm
{
	 void sub()
	{
		System.out.println("protected");
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Accessmprotect pro = new Accessmprotect();
		System.out.println(pro.var);
		pro.add1();
		
		
	}

}
