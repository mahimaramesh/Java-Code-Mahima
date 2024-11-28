package Problems;

import java.util.Scanner;

public class MatrixRowAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int rowSum = 0;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += arr[i][j];
            }
            System.out.println(rowSum);
        }

    }
}
