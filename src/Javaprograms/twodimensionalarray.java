package Javaprograms;

public class twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][] = { { 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println("");
		}

	}
}
