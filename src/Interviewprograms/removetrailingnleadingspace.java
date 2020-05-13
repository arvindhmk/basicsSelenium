package Interviewprograms;

public class removetrailingnleadingspace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String st=" I love my india ";
		
		System.out.println(st.stripLeading());
		System.out.println(st.stripTrailing());
		System.out.println(st.replaceAll("^[ \t]", ""));
		System.out.println(st.replaceAll("[ \t]+$","" ));
		System.out.println(st.strip());
		System.out.println(st.trim());
	}

}
