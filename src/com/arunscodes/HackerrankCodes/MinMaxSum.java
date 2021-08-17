package com.arunscodes.HackerrankCodes;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Integer minSum=0;
        Integer maxSum=0;


        for (int i=0;i<arr.size();i++){
            Integer sum=0;

            for(int j=0;j<arr.size();j++){
                sum+=arr.get(j);
            }

            sum-=arr.get(i);

            if(minSum==0)
                minSum=sum;
            if(maxSum==0)
                maxSum=sum;
            if(sum>maxSum)
                maxSum=sum;
            if(sum<minSum)
                minSum=sum;
        }

        System.out.println(minSum +" " +maxSum);

    }

}

class Solution3 {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        MinMaxSum.miniMaxSum(arr);
    }
}






