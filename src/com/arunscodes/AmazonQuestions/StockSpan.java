package com.arunscodes.AmazonQuestions;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    static void calculateSpan(int price[], int n, int S[]){
        Stack<Integer> st = new Stack<>();
        st.push(0);

        //Span value of first element is always 1.
        S[0] = 1;

        //Calculate Span values of rest of the elements.
        for(int i=1; i<n; i++){

            // Pop elements from stack while stack is not empty and Top of the stack is smaller than price[i]
            while(!st.empty() && price[st.peek()] <= price[i])
                st.pop();

            // if stack becomes empty, price[i] is greater than all the elements on the left of it.
            // else price[i] is greater than elements after the top of stack.
            S[i] = (st.empty())?(i+1) : (i-st.peek());

            st.push(i);
        }
    }
    static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int price[] = {10,5,6,90,120,80};
        int n = price.length;
        int S[] = new int[n];

        calculateSpan(price,n,S);

        printArray(S);
    }
}
