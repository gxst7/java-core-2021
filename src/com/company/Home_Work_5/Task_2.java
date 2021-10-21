package com.company.Home_Work_5;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Необходимо написать программу по умножению двух матриц.
 * Пользователь вводит матрицы с клавиатуры.
 */
public class Task_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix1 = getMatrixFromInput();
        int[][] matrix2 = getMatrixFromInput();

        for (int[] i : multiplyByMatrix(matrix1, matrix2)) {
            System.out.println(Arrays.toString(i));
        }
    }

    private static int[][] getDimension() {
        int[][] matrix;
        System.out.println("Enter numbers for dimension");
        if (scanner.hasNextInt()) {
            matrix = new int[scanner.nextInt()][scanner.nextInt()];
        } else {
            System.out.println("you made a mistake. try again");
            scanner.next();
            matrix = getDimension();
        }
        return matrix;
    }

    private static int[][] getMatrixFromInput() {
        int[][] matrix = getDimension();
        System.out.println("enter values");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("you made a mistake. try again");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] multiplyByMatrix(int[][] m1, int[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if(m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        int[][] mResult = new int[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
            for(int j = 0; j < mRColLength; j++) {     // columns from m2
                for(int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }
}
