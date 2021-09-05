package com.arunscodes.AmazonQuestions2;

public class DivideArrayBySum {

    static void printSubArray( int arr[], int start, int end){
        for (int i = start; i<=end;i++){
            System.out.print(arr[i]);
        }
    }

    static boolean divideArray(int[] arr, int n ){
        int sum = 0;

        for(int i = 0; i < n ; i++)
            sum += arr[i];

        int sum_so_far= 0;

        for(int i = 0; i< n ; i++){
            if(2 * sum_so_far + arr[i] == sum){
                System.out.println(" the Arrays are: ");
                printSubArray(arr, 0, i-1);
                printSubArray(arr, i+1, n-1);

                return true;
            }
            sum_so_far+=arr[i];
        }
        System.out.println("Can't be divided.");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {6,2,3,2,1};
        int n = arr.length;

        divideArray(arr,n);
    }
}
