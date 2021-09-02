package com.arunscodes.AmazonQuestions;

import java.util.Arrays;

public class NextGreatElement {

    //TODO : Try to implement stockspan logic to this issue too.

    static int[] printNGE(int arr[], int n ){
        int res[] = new int[n];
        for(int i = 0 ;i<n;i++){
            int g = -1;
            for( int j = i+1; j<n;j++){
                if(arr[j]>arr[i]){
                    g = arr[j];
                    break;
                }
            }
            res[i] = g;
        }
        return res;
    }

    static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,25};
        int n = arr.length;

        int res[] = printNGE(arr,n);

        printArray(res);
    }
}
