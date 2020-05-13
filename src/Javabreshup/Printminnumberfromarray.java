package Javabreshup;

public class Printminnumberfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[][] = { { 4, 6, 7 }, { 3, 9, 2 }, { 1, 10, 8 } };
		int min = array1[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array1[i][j] < min) {
					min = array1[i][j];
				}
			}
		}
		System.out.println("minimum number in array "+ min);

	}
}