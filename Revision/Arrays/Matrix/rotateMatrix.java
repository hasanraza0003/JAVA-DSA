import java.util.*;

public class rotateMatrix {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the matrix dimension -> Row then Col -> ");
                int row = sc.nextInt();
                int col = sc.nextInt();

                int mat[][] = new int[row][col];
                int mat2[][] = new int[row][col];

                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                mat[i][j] = sc.nextInt();
                                mat2[i][j] = mat[i][j];
                        }
                }

                rotateClockWise(mat, row, col);
                rotateCounterClockWise(mat2,row,col);

                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                System.out.print(mat[i][j] + " ");
                        }
                        System.out.println();
                }

                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                System.out.print(mat2[i][j] + " ");
                        }
                        System.out.println();
                }

                sc.close();
        }

        public static void rotateClockWise(int[][] mat, int row, int col) {
                // transpose
                transpose(mat, row, col);

                // reverse
                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col/2; j++) {
                                int temp = mat[i][j];
                                mat[i][j] = mat[i][col - 1 - j];
                                mat[i][col - 1 - j] = temp;
                        }
                }
        }
        public static void rotateCounterClockWise(int[][] mat, int row, int col) {
                // transpose
                transpose(mat, row, col);

                // reverse
                for (int i = 0; i < row/2; i++) {
                        for (int j = 0; j < col ; j++) {
                                int temp = mat[i][j];
                                mat[i][j] = mat[col-1-i][j];
                                mat[col-1-i][j] = temp;
                        }
                }
        }

        public static void transpose(int[][] mat,int row,int col){
                // transpose
                for (int i = 0; i < row; i++) {
                        for (int j = i; j < col; j++) {
                                int temp = mat[i][j];
                                mat[i][j] = mat[j][i];
                                mat[j][i] = temp;
                        }
                }       
        }

}
