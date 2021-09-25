package com.arunscodes.AmazonQuestions;

import java.util.ArrayList;
import java.util.List;

public class EncodedString {

    static String decodeString(int numberOfRows, String encodedString){
        int n = encodedString.length();
        int nCol = n/numberOfRows;

        StringBuilder sb = new StringBuilder();

        char[][] matrix = new char[numberOfRows][nCol];

        int k = 0;
        for(int i = 0; i<numberOfRows;i++){
            for(int j = 0; j<nCol;j++){
                if(encodedString.charAt(k)!='_')
                matrix[i][j] = encodedString.charAt(k);
                else
                    matrix[i][j] = ' ';
                k++;
            }
        }

        int i = 0;
        int p;
//        for(int i = 0; i<numberOfRows; i++){
            for(int j = 0; j<nCol; j++){
                sb.append(matrix[i][j]);
                for(p=1;p<21;p++)
                if(i+p < numberOfRows && j+p < nCol)
                sb.append(matrix[i+p][j+p]);
//                if(i+2 < numberOfRows && j+2 < nCol)
//                sb.append(matrix[i+2][j+2]);
            }
//        }

        return sb.toString();

    }



    public static void main(String[] args) {

        String encodedString = "nchjbbxmpkbw________________________________ladodnkameqd__________rrdwbelpcwck__________bzqfecoqohlq__________bosrfdrfqsjt________________________________qkdsaglknmix__________bkxjrglhwgvi__________hyrycxnonbsx";
        int numberOfRows = 10;

        System.out.println(decodeString(numberOfRows,encodedString));
    }
}
