package com.arunscodes.Algorithms.Sorting;

public class InsertionSort {
    void sort (int arr[]) {
        int n = arr.length;

        for(int i = 1; i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

    }


    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"  ");
        }
    }

    public static void main(String[] args) {
        InsertionSort ib = new InsertionSort();
        int arr[] = {1,7,3,7,3,5,4};
        ib.sort(arr);
        ib.printArray(arr);
    }
}
