package com.epam.module3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number rows for Matrix A: ");
            int rowA = sc.nextInt();
            System.out.println("Please enter number columns for Matrix A: ");
            int colA = sc.nextInt();
            Matrix matrixA = new Matrix(rowA, colA);
            matrixA.fillMatrix();
            Operation.matrixShow(matrixA);
            System.out.println("Please enter number rows for Matrix B: ");
            int rowB = sc.nextInt();
            System.out.println("Please enter number columns for Matrix B: ");
            int colB = sc.nextInt();
            Matrix matrixB = new Matrix(rowB, colB);
            matrixB.fillMatrix();
            Operation.matrixShow(matrixB);
            Matrix result = Operation.multiplyMatrixes(matrixA, matrixB);
            System.out.println("The result of multiplying is: ");
            Operation.matrixShow(result);
        } catch (Exception e) {
            System.out.println("Something is going wrong");
            e.printStackTrace();
        }
    }
}
