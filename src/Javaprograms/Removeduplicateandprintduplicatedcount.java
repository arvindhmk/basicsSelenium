package Javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Removeduplicateandprintduplicatedcount 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int ar[]= {4,5,5,5,4,6,6,9,4};
		
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			int k=0;
			if(!al.contains(ar[i]))
			{
				al.add(ar[i]);
				k++;	
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					k++;
				}
			}	
				System.out.println(ar[i]+" == "+k);
				
				if(k==1)
				{
					System.out.println(ar[i]+" is unique number");
				}
			
			
		}
	}

		
		
		
	}

}
