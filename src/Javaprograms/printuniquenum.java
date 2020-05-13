package Javaprograms;

import java.util.Arrays;

public class printuniquenum 
{
//print unique values
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int arr[]= {6,6,7,7,9,9,4,4,2,2,3,6,6};
		
		  Arrays.sort(arr); 
	      int n=arr.length;
	        // Traverse the sorted array 
	        for (int i = 0; i < n; i++) 
	        { 
	            // Move the index ahead while  
	            // there are duplicates 
	            while (i < n - 1 && arr[i] == arr[i + 1]) 
	                i++; 
	      
	            // print last occurrence of  
	            // the current element 
	            System.out.print(arr[i] +" "); 
	}

}
	
}
