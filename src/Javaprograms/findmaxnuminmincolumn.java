package Javaprograms;

public class findmaxnuminmincolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[][] = { { 4, 6, 7 }, 
							{ 3, 9, 2 }, 
							{ 1, 10, 8 } };
		int min = array1[0][0];
		int mincolumn = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array1[i][j] < min) {
					min = array1[i][j];
					mincolumn=j;
				}
			}
		}
		int k=0;
		int max = array1[0][mincolumn];
		while(k<3)
		{
			if(array1[k][mincolumn]>max)
			{
				max=array1[k][mincolumn];
			}
			k++;
		}
		
		System.out.println("min value in array "+min);
		System.out.println("Max value in that min value column "+max);
		
	}

}
