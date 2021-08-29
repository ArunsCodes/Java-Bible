package com.arunscodes.Algorithms.Sorting;

public class SelectionSort {

    // Sorts through the elements based on their lowest value.
    // Time Complexity : O(n^2)

    void sort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }



    }

    void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " , ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {20, 30 , 10, 20, 14};
        ob.sort(arr);
        ob.printArray(arr);

    }
}
