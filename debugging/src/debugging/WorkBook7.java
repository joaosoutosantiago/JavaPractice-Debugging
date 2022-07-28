package debugging;

import java.util.Arrays;

public class WorkBook7 {

	public static void main(String[] args) {
        int[][] matrix = { //matrix means 2d array
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
           };

           for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix.length; j++) {
                   matrix[i][j] = j;
               }
           }
           printMatrix(matrix);
	}
	
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
	
}
