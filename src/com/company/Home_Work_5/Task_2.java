package com.company.Home_Work_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Необходимо написать программу по умножению двух матриц.
 * Пользователь вводит матрицы с клавиатуры.
 */
public class Task_2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        int a, b;
        int[][] matrix1;
        int[][] matrix2;

        System.out.println("Dimension of matrix: n * m");
        n = scanner.nextInt();
        m = scanner.nextInt();
        matrix1 = new int[n][m];

        System.out.println("enter values");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("enter n * m");
        a = scanner.nextInt();
        b = scanner.nextInt();
        matrix2 = new int[a][b];

        System.out.println("enter values");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(multiplyByMatrix(matrix1, matrix2)));
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
