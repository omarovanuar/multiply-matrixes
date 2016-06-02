package com.epam.module3;

public class Operation {
    public static Matrix multiplyMatrixes(Matrix matrixA, Matrix matrixB) {
        Matrix resultMatrix = new Matrix(matrixA.getRow(), matrixB.getCol());
        int resultValue[][] = resultMatrix.getValue();
        for (int i = 0; i < resultMatrix.getRow(); i++) {
            for (int j = 0; j < resultMatrix.getCol(); j++) {
                for (int k = 0; k < matrixA.getCol(); k++) {
                    resultValue[i][j] += matrixA.getValue()[i][k] * matrixB.getValue()[k][j];
                }
            }
        }
        resultMatrix.setValue(resultValue);
        return resultMatrix;
    }

    public static void matrixShow(Matrix matrix) {
        int[][] value = matrix.getValue();
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getCol(); j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }
}
