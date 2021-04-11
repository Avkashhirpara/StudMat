package com.studmat.progs.arrays;

public class RotateImage {


    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int temp = 0;
        for (int i = 0; i < len/2 ; i++) {
            for (int j = i; j < (len-1-i); j++) {
                temp =  matrix[len-1-i][j];
                matrix[len-1-i][j] =  matrix[len-1-j][len-1-i];
                matrix[len-1-j][len-1-i] = matrix[i][len-1-j];
                matrix[i][len-1-j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] =new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int matrix3[][] =new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(matrix3);
        new RotateImage().rotate(matrix3);
        System.out.println("==========================================");
        printMatrix(matrix3);

    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
