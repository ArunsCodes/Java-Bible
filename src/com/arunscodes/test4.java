package com.arunscodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test4 {

    int leastSortedIndex = 0;

    public static void main (String args[]) {


        List<String> input = new ArrayList<String>();
//        ;


        input.add("hello");
        input.add("try");
        input.add("hello");
        input.add("no");
        input.add("yes");
        input.add("yes");

//        sortedList = try,no,hello,yes


        List<String> sortedList = new ArrayList<>();
//        "try,no,hello,yes";
        sortedList.add("try");
        sortedList.add("no");
        sortedList.add("hello");
        sortedList.add("yes");


        List<String> sortedResult = sortTheList(input,sortedList);

        for(String listElement : sortedResult)
            System.out.println(listElement +" ");

    }


        public static List<String> sortTheList( List<String> input, List<String> sortedList) {

        for(String element : sortedList)
            Collections.sort(input, Comparator.comparing( key -> key.equals(element)));

        return input;
        }

//        Output = try,no,hello,hello,yes,yes

}
