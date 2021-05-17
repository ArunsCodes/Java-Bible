package com.arunscodes.Algorithms;

public class FibonacciMemoization {
    static int MAX = 100;
    static int NIL = -1;

    static int lookup[] = new int[MAX];

    void _initialize(){
        for(int i = 0;i<MAX; i++){
            lookup[i]=NIL;
        }
    }

    static int fib(int n){
        if(lookup[n]==NIL){
            if(n<=1)
                lookup[n]=n;
            else
                lookup[n] = fib(n-1) + fib(n-2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        FibonacciMemoization f = new FibonacciMemoization();
        int n = 20;
        f._initialize();
        System.out.println(" Fib no. is :: " +fib(n));
    }

}
