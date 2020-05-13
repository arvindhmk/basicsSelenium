package Javaprograms;

public class palindromewithstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "madam";
		String reversestring = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reversestring = reversestring + value.charAt(i);
		}
		System.out.println(reversestring);
		if (value.compareTo(reversestring)==0) {
			System.out.println("The given string is palindrom");
		} else
			System.out.println("The given string is not palindrome");

	}

}
