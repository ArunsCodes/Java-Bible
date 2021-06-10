package com.arunscodes.HackerrankCodes;

public class NumShuffle {


    public static int[] shuffle(int[] nums, int n) {

        int[] arr=new int[2*n];

        for(int i=0,j=1,k=0; i<2*n; i+=2,j+=2,k+=1){

            arr[i]=nums[i/2];
            arr[j]=nums[n+k];
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] op = shuffle(nums,n);

    }

}
