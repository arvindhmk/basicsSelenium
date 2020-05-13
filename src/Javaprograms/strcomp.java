package Javaprograms;

public class strcomp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s5 = "Bhanu";
		  String s6 = "Bhanu";
		  String s7 = new String("Pratap");
		  // true (because both refer to same instance)
		  System.out.println(s5 == s6);
		  // false(because s7 refers to instance created in nonpool)
		  System.out.println(s5 == s7);
		  
		  System.out.println(s6 == s7);
	}

}
