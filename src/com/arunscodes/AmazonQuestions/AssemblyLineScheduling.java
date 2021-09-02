package com.arunscodes.AmazonQuestions;

public class AssemblyLineScheduling {

    //Todo: Understand

    static int num_line = 2;
    static int num_station = 4;

    static int min(int a, int b)
    {
        return a<b ?a:b;
    }

    static int carAssembly(int a[][], int t[][], int e[], int x[]){
        int T1[] = new int[num_station];
        int T2[] = new int[num_station];
        int i;

        T1[0] = e[0] + a[0][0];
        T2[0] = e[1] + a[1][0];

        for(i=1;i<num_station;i++){
            T1[i] = min(T1[i-1] + a[0][i], T2[i-1] + t[1][i] + a[0][i]);
            T2[i] = min(T2[i-1] + a[1][i], T1[i-1] + t[0][i] + a[1][i]);
        }

        return min(T1[num_station-1] + x[0], T2[num_station-1] + x[1]);
    }


    public static void main(String[] args) {

        int a[][] = {{4, 5, 3, 2}, {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5}, {0, 9, 2, 8}};
        int e[] = {10, 12};
        int x[] = {18, 7};

        System.out.println(carAssembly(a, t, e, x));
    }
}
