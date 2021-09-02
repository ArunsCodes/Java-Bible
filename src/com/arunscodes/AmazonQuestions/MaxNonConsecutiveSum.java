package com.arunscodes.AmazonQuestions;

public class MaxNonConsecutiveSum {

    //Todo : Understand :P

    int findMaxSum(int arr[], int n){
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;

        for(i = 1; i<n ; i++){
            excl_new = (incl>excl)? incl : excl;

            incl = excl + arr[i];
            excl = excl_new;
        }
        return ((incl>excl)?incl:excl);
    }

    public static void main(String[] args) {
        MaxNonConsecutiveSum ms  = new MaxNonConsecutiveSum();
        int arr[] = new int[]{1,2,3};
        System.out.println(ms.findMaxSum(arr,arr.length));
    }
}
