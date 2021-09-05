package com.arunscodes.Algorithms.DynamicProgramming;

public class LongestIncreasingSequence {

    //Recursive Solution
    // Formula: F(n) = 1 + max(f(0-(n-1)) && arr(n-1)<arr(n);

    static int max_ref;

    static int _lis(int arr[], int n){

        //base case.
        if(n==1)
            return 1;

        int res, max_ending_here = 1;

        for(int i = 1; i<n;i++){
            res = _lis(arr,i);
            if(arr[i-1]<arr[n-1] && res+1 > max_ending_here)
                max_ending_here = res + 1;
        }

        if(max_ref < max_ending_here)
            max_ref = max_ending_here;

        return max_ending_here;
    }

    static int lis(int arr[], int n){
        max_ref = 1;
        _lis(arr,n);
        return max_ref;
    }


    // Dynamic Programming Solution.
    // This problem has Overlapping substructure property and recomputation can be avoided using memoization and tabulation.


    static int dLis(int arr[], int n){
        int lis[] = new int[n];

        int i, j , max= 0;

        for(i =0; i<n ; i++)
            lis[i] = 1;

        for(i=1; i<n ;i++)
            for(j=0; j<i ; j++)
                if(arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j]+1;

        for(i = 0; i< n ;i++){
            if(max < lis[i])
                max = lis[i];
        }

        return max;
    }


    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 18, 21, 54, 23, 2};
        int n = arr.length;

        System.out.println("The max number with R  : " +lis(arr,n));
        System.out.println("The max number with DP : " + dLis(arr,n));

    }



}
