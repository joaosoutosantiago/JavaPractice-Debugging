package debugging;

import java.util.Arrays;

public class Arrays2d {

	public static void main(String[] args) {

        int[][] matrix = new int[][] {
            {1, 2, 3},
            {8, 6, 4},
            {4, 5, 6}
        };

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (j < i) ? 0 : matrix[i][j];
            }
        }
        printArray(matrix);
        
	}
	
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
