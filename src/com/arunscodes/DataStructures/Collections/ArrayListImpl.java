package com.arunscodes.DataStructures.Collections;

import java.util.ArrayList;

public class ArrayListImpl {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for( int i = 0; i<5; i++)
        {
            arrayList.add(i);
        }
        int j=0;
        while (j<arrayList.size()){
            System.out.println(arrayList.get(j));
            j++;
        }

        arrayList.remove(3);


    }
}
