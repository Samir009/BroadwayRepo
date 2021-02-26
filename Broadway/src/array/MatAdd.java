package array;

public class MatAdd {
	public static void main(String[] args) {
		int mat1[][] = { { 2, 1 }, { 2, 3 } };
		int mat2[][] = { { 1, 1 }, { 3, 3 } };

		int totalMat[][] = new int[2][2];

		// write
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				totalMat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		// read

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(totalMat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
