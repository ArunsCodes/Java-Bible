package com.arunscodes.AmazonQuestions;

public class MatrixRotate {
    //TODO : Incomplete.

    void rotateMatrix(int[][] arr){
        int n = arr[0].length;
        for (int j = n-1 ;j>=0;j--){
            for (int i=0;i<n;i++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
//        printMatrix(arr);
    }

    void printMatrix(int[][] arr){
        int length = arr[0].length;

        for (int i = 0 ; i<length ; i++){
            for(int j = 0; j<length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        System.out.println("Matrix given : ");
        MatrixRotate mr = new MatrixRotate();
        mr.printMatrix(arr);
        mr.rotateMatrix(arr);
//        mr.printMatrix(arr);arr


    }
}
