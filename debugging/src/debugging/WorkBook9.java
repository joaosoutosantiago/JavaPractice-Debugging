package debugging;

import java.util.Arrays;

public class WorkBook9 {

	public static void main(String[] args) {
		
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {8, 6, 4},
            {2, 4, 6}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    matrix[i][j] = 0;
                }
            } 
        }

        System.out.println();
        printMatrix(matrix);

	}
	
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
