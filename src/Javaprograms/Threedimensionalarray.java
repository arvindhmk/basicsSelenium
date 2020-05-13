package Javaprograms;

import java.util.Scanner;

public class Threedimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][][] = new int[3][4][3];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					ar[i][j][k] = input.nextInt();
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		
	}

}
