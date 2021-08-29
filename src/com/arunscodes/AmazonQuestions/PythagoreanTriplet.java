package com.arunscodes.AmazonQuestions;

import java.util.Arrays;

public class PythagoreanTriplet {

    static boolean checkTriplet(int[] arr, int n){

        /*
        Naive Logic - O(n^3)
        for(int i = 0;i<n;i++){
            for(int j =i+1; j<n ; j++){
                for(int k = j+1; k<n;k++){
                    int x = arr[i]*arr[i] , y = arr[j]*arr[j] , z = arr[k]*arr[k];

                    if( x == y+z || y == x+z || z == x+y)
                        return true;
                }
            }
        }*/

        /*// Using sorting
        int[] squaredArray = new int[n];

        for(int i = 0 ; i<n ; i++){
            squaredArray[i] = arr[i] * arr[i];
        }

        Arrays.sort(squaredArray);

        // Meet in the middle algorithm //ToDo
        for(int i = n-1 ; i>=2;i--)
        {
            int l =0;
            int r = i - 1;
            while ( l < r){
                if(squaredArray[l] + squaredArray[r] == squaredArray[i]){
                    return true;
                }

                if(squaredArray[l] + squaredArray[r] < squaredArray[i])
                    l++;
                else
                    r--;
            }
        }*/

        // Using Hashing
        int max = 0;

        for(int i = 0; i<n ; i++){
            max = Math.max(max,arr[i]);
        }

        int[] hash = new int[max+1];




        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,6,5};

        boolean answer = checkTriplet(arr, arr.length);

        System.out.println(answer);


    }
}
