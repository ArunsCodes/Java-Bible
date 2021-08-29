package com.arunscodes.Algorithms.Sorting;

public class BubbleSort {
    void sort (int arr[]) {
        int n = arr.length;
        boolean sorted;
         do {
             sorted = false;
            for (int i = 0; i < n-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = true;
                }

            }
        }while (sorted);

        /*for(int i = 0 ;i <n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
    }



    void printArray(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i] +",");
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[]= {10,20,13,24,15,16};
        ob.sort(arr);
        ob.printArray(arr);
    }
}
