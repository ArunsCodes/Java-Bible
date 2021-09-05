package com.arunscodes.Algorithms.DynamicProgramming;

public class FibMemoization {
    final int MAX = 100;
    final int NIL = -1;

    int lookup[] = new int[MAX];

    void _initialize(){
        for(int i = 0;i<MAX;i++){
            lookup[i] = NIL;
        }
    }

    int fib(int n){
        if(lookup[n]==NIL)
        {
            if(n<=1)
                lookup[n] = n;
            else
                lookup[n] = fib(n-1)+fib(n-2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        FibMemoization f = new FibMemoization();
        f._initialize();
        int res = f.fib(10);
        System.out.println("Result :: " + res);
    }

}
