package Interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reversestring 
{
	//to reverse string using string bufferfunction
	public void usingfunction() 
	{
	
		StringBuffer str= new StringBuffer("Arvindh");
		StringBuffer str1 = str.reverse();
		System.out.println(str1);	
	}
	 public void usinglogic()
	 {
		 String st="hello";
		 String reverse="";
		 char[] starray=st.toCharArray();
		 
		 int length= starray.length;
		 
		 for(int i=length-1;i>=0;i--)
		 {
			 reverse = reverse+starray[i];
		 }
		 System.out.println(reverse);
	 }
	
	 public void usingcollection()
	 {
		 
		 String s1="hai";
		 char[] s1array=s1.toCharArray();
		 List<Character> ch = new ArrayList<Character>();
		 for (Character charac : s1array) 
		 {
		
			 ch.add(charac);
			 
		 }
			 Collections.reverse(ch);
			 
			ListIterator<Character> iter =ch.listIterator();
			
			while(iter.hasNext())
			{
			System.out.print(iter.next());
			}			
		} 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		reversestring rev = new reversestring();
		//rev.usingfunction();
		//rev.usinglogic();
		rev.usingcollection();
		
		
		
		
//default logic
//using collections		
		
	}

}
