package com.arunscodes.HackerrankCodes;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args){
        int[] arr  = {4, 5, 2, 1, 2, 3,4};
        int target = 6;
        int l = 0;
        int r = arr.length;

        Arrays.sort(arr);
        System.out.print(findTarget(arr,target));
        System.out.print(findTargetUsingRecursion(arr,target, l , r));
    }

    static int findTargetUsingRecursion(int[] arr, int target, int l, int r){

            int mid = l + (r - l) / 2;


            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                return findTargetUsingRecursion(arr, target, l, mid);
            } else {
                return findTargetUsingRecursion(arr, target, mid + 1, r);
            }
    }

    static int findTarget(int[] arr, int target){

        int l = 0;
        int r = arr.length;
        int mid = l + (r-l)/2;


        Arrays.sort(arr);

        while(l < r){
            mid = l + (r-l)/2;
            if(arr[mid]==target){
                return arr[mid];
            } if( arr[mid] > target){
                r = mid;
            } else {
                l = mid+1;
            }
        }

        return arr[mid];

    }
}
