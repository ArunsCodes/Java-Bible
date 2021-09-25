package com.arunscodes.HackerrankCodes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GlobalMaximum {

    public static int findMaximum(int[] arr, int m ){

        List<Integer[]> subseq = findSubsequence(arr);


        for(int i = 0 ; i< subseq.size(); i++)
        {
            double currentMinimum = Math.pow(10,18);
            for(int j=0; j<m; j++){

            }
        }



        return 0;


    }

    public static List<Integer[]> findSubsequence(List<Integer> arr){
        int opSize = (int) Math.pow(2,arr.size());
        List<Integer[]> subs = new ArrayList<>();

        int k = 0 ;

        for(int i = 1; i<opSize; i++){
            for(int j=0; j<arr.size(); j++ ){
                if(BigInteger.valueOf(i).testBit(j))
                    subs.set(i, new Integer[]{arr.get(j)});
            }
        }

        return subs;
    }





    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int m = 3;

        findSubSequence(arr);

//        System.out.println(m/ax);

    }
}
