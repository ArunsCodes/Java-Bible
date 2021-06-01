package com.arunscodes.DataStructures.Collections;
import java.util.*;


//Vector, Stack, Queue, Dequeue Implementation.

public class VSQDImpl {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        Stack<String> stringStack = new Stack<>();
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();

        //Vector implementation
        System.out.println("====== Vector =======");

        for(int i=0;i<5;i++){
            integerVector.add(i);
        }

        System.out.println(integerVector);

        integerVector.remove(2);

        System.out.println(integerVector);


        //Stack Implementation
        System.out.println("====== Stack =======");
        stringStack.push("Hello!");
        stringStack.push("I'm a stack!");
        stringStack.push("Made to understand myself for Arun!");

        Iterator<String> iterator = stringStack.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        stringStack.pop();

        iterator = stringStack.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //Queue - Priority Queue implementation

        System.out.println("====== Queue (Priority Queue) =======");
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(24);
        integerPriorityQueue.add(45);

        //Printing the top element of the queue
        System.out.println(integerPriorityQueue.peek());

        //Printing the top element and removing from container
        System.out.println(integerPriorityQueue.poll());

        //Printing the top element of the queue again.
        System.out.println(integerPriorityQueue.peek());


        //DeQueue Implementation.
        System.out.println("====== DeQueue =======");
        stringArrayDeque.add("10");
        stringArrayDeque.add("20");
        stringArrayDeque.add("30");

        System.out.println(stringArrayDeque);

        stringArrayDeque.clear();

        stringArrayDeque.addFirst("251");
        stringArrayDeque.addFirst("252");
        stringArrayDeque.addLast("321");

        System.out.println(stringArrayDeque);







    }
}
