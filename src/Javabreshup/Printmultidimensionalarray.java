package Javabreshup;

public class Printmultidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a[row][column]
		int a[][] = new int[2][3];

		a[0][0] = 3;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;

		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
