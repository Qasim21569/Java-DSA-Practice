//program to add two matrices of size 2*3

package Arrays;

public class array4 {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 6, 5, 4 }, { 3, 2, 1 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.format("Setting value for i=%d and j=%d \n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(result[i][j] + " ");

                System.out.print("");
            }
        }
    }
}