package com.epam.module3;

import java.util.Random;

public class Matrix {
    private int row;
    private int col;
    private int value[][];

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        value = new int[row][col];
    }

    public int[][] fillMatrix() {
        Random rnd = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                value[i][j] = rnd.nextInt(10);
            }
        }
        return value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }
}
