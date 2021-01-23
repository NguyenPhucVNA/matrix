package com;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private int rowA;
    private int rowB;
    private int row;
    private int colA;
    private int colB;
    private int col;
    private double[][] matrixA;
    private double[][] matrixB;
    private double[][] matrix;
    public double[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(double[][] matrixA) {
        this.matrixA = matrixA;
    }

    public double[][] getMatrixB() {
        return matrixB;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }




    public int getRowA() {
        return rowA;
    }

    public int getRowB() {
        return rowB;
    }

    public int getColA() {
        return colA;
    }

    public int getColumnB() {
        return colB;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    // init the matrix
     void initMatrixA() {
        System.out.println("Enter size of first matrix:");
        rowA = scanner.nextInt();
        colA = scanner.nextInt();
        matrixA = new double[rowA][colA];
        System.out.println("Enter first matrix:");
        for (int hor = 0; hor < rowA; hor++) {
            System.out.println();
            for (int ver = 0; ver < colA; ver++) {
                matrixA[hor][ver] = scanner.nextDouble();
            }
        }

    }
     void initMatrixB() {
        System.out.println("Enter size of second matrix:");
        rowB = scanner.nextInt();
        colB = scanner.nextInt();
        matrixB = new double[rowB][colB];
        System.out.println("Enter second matrix:");
        for (int hor = 0; hor < rowB; hor++) {
            System.out.println();
            for (int ver = 0; ver < colB; ver++) {
                matrixB[hor][ver] = scanner.nextDouble();
            }
        }

    }
     void initMatrix() {
        System.out.println("Enter size of matrix:");
        row = scanner.nextInt();
        col = scanner.nextInt();
        matrix = new double[row][col];
        System.out.println("Enter matrix:");
        for (int hor = 0; hor < row; hor++) {
            System.out.println();
            for (int ver = 0; ver < col; ver++) {
                matrix[hor][ver] = scanner.nextDouble();
            }
        }
    }

}


















