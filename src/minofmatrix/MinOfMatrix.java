/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minofmatrix;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class MinOfMatrix {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter the number of rows in matrix: ");
        int rowsNumber = input.nextInt();

        System.out.println("Please enter the number of columns in matrix: ");
        int columnsNumber = input.nextInt();

        int[][] matrix = fillMatrix(rowsNumber, columnsNumber);

        int min = getSmallest(matrix);

        System.out.println("The min value is: " + min);

    }

    public static int[][] fillMatrix(int rowSize, int columnSize) {

        int[][] matrix = new int[rowSize][columnSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Please enter the value of item in row " + (i + 1) + " and column " + (j + 1));
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int getSmallest(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

}
