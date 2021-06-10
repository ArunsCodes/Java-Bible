package com.arunscodes.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamImpl {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5);

        //Map Method
        List<Integer> square = number.stream().map(x-> x*x).collect(Collectors.toList());

        System.out.println("The Squares using map method : " +square);

        //Filter Method
        List<String> names = Arrays.asList("Arunmozhi", "Nambi", "Momo");

        List<String> filteredNames = names.stream().filter(s-> s.startsWith("M")).collect(Collectors.toList());

        System.out.println("Filtered Names :" +filteredNames);

        //Sorted Method.
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted Names :" +sortedNames);


        //Collect method to Return a SET.
        List<Integer> numbers2 = Arrays.asList(1,2,4,5,6,3);

        Set<Integer> squareSum = numbers2.stream().map(s->s*s).collect(Collectors.toSet());

        System.out.println("Squared Set : " +squareSum);

        //ForEach method example.
        numbers2.stream().map(x->x*x).forEach(y->System.out.println("Y = " +y));

        //Reduce Method Example.
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);

        System.out.println("Reduced even  :" +even);
    }

}
