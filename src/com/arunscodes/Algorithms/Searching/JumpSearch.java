package com.arunscodes.Algorithms.Searching;

public class JumpSearch {

    static int findIndex(int arr[], int val){
        int n = arr.length;
        int m = (int) Math.floor(Math.sqrt(arr.length));
        int i = 0;

        while(i<n){
            if(arr[i]<val){
                i+=m;
                continue;
            }

            if(arr[i]>=val){
                i-=m;

                for(;i<n;i++){
                    if(arr[i]==val)
                        return i;
                }
                break;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {0,10,22,34,45,65,68,79,80,91};

        JumpSearch jp = new JumpSearch();
        int index  = findIndex(arr,91);

        System.out.println("Index : " +index);

    }

}
