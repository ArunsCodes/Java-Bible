package com.arunscodes.AmazonQuestions2;

import java.util.Arrays;

public class MaxOfJI {

    int maxIndexDiff(int arr[] , int n ){
        int maxDiff = -1;
        int i, j ;

        for(i=0;i<n;i++){
            for (j=n-1; j>1 ; --j){
                if(arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j-i;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {



    }
}
