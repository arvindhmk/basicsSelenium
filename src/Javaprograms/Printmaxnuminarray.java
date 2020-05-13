package Javaprograms;

public class Printmaxnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array2[][] = { { 4, 6, 99 }, { 3, 9, 2 }, { 1, 10, 8 } };
		int max = array2[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array2[i][j] > max) {
					max = array2[i][j];
				}
			}
		}
		System.out.println("Maximun number in array " + max);
	}
}
