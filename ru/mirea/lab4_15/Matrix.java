package ru.mirea.lab4_15;

public class Matrix {
    double data[][];
    int rows;
    int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
        for(int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                data[i][j] = i+j;
            }
        }
    }
    public void add(Matrix matrix) {
        for(int i = 0; i < matrix.rows; i++)
            for(int j = 0; j < matrix.cols; j++)
                this.data[i][j] += matrix.data[i][j];
    }
    public void show() {
        for(int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++)
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void multiplication(double n) {
        for(int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++)
                data[i][j] *= n;
        }
    }
}
