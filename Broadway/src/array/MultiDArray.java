package array;

import java.util.Scanner;

public class MultiDArray {
	public static void main(String[] args) {
		int mat[][] = new int[2][2];

		Scanner in = new Scanner(System.in);

		// write
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("Enter value of mat: ");
				mat[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
