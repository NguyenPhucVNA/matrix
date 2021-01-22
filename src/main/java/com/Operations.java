package com;

public class Operations extends Matrix implements Calculation,Transpose{

    @Override
    public void multiplyByConstant() {
        initMatrix();
        System.out.print("Enter constant: ");
        double constant = scanner.nextDouble();
        for (int hor = 0; hor < getRow(); hor++) {
            for (int ver = 0; ver < getCol(); ver++) {
                getMatrix()[hor][ver] *= constant;
            }
        }
        printMatrix(getMatrix());
    }

    @Override
    public void addition() {
        initMatrixA();
        initMatrixB();
        if (getColA() != getColumnB() || getRowA() != getRowB()) {
            System.out.println("ERROR");
        } else
            for (int row = 0; row < getRowA(); row++) {
                for (int column = 0; column < getColA(); column++) {
                    getMatrix()[row][column] += getMatrixB()[row][column];
                }
            }
        printMatrix(getMatrixA());
    }

    @Override
    public void multiplyMatrices() {
        initMatrixA();
        initMatrixB();
        setMatrix(new double[getRowA()][getColumnB()]);
        if (getColA() != getRowB()) {
            System.out.println("The operation cannot be performed.");
        }
        else
            for (int hor = 0; hor < getRowA(); hor++) {
                for (int ver = 0; ver < getColumnB(); ver++) {
                    for (int i = 0; i < getColA(); i++) {
                        getMatrix()[hor][ver] += getMatrixA()[hor][i] * getMatrixB()[i][ver];
                    }
                }
            }
        printMatrix(getMatrix());
    }

    @Override
    public void mainTranspose() {
            initMatrix();
        setMatrixA(new double[getCol()][getRow()]);
        for (int hor = 0; hor < getCol(); hor++) {
            for (int ver = 0; ver < getRow(); ver++) {
                getMatrixA()[hor][ver] = getMatrix()[ver][hor];
            }
        }
        printMatrix(getMatrixA());
    }

    @Override
    public void sideTranspose() {
        initMatrix();
        setMatrixA(new double[getCol()][getRow()]);
        for (int hor = 0; hor < getCol(); hor++) {
            for (int ver = 0; ver <getRow(); ver++) {
                getMatrixA()[hor][ver] = getMatrix()[getRow()-ver-1][getCol()-1-hor];
            }
        }
        printMatrix(getMatrixA());
    }

    @Override
    public void verticalTranspose() {

    }

    @Override
    public void horizontalTranspose() {

    }
    private void printMatrix(double[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("The result is: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
