package com.arunscodes.DataStructures.Collections;

import java.util.LinkedList;

public class LinkedListCollectionImpl {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello!");
        linkedList.add("Welcome to Linked List collection Implementation");
        linkedList.add("It was nice to meet you!");

        for (String s : linkedList) {
            System.out.println(s);
        }

        linkedList.addLast("Hi, forgot to intro, I'm Arun.");
        linkedList.add(3,"I got added later");
        linkedList.addFirst("Greetings!!");


        for (String s : linkedList) {
            System.out.println(s);
        }

    }
}
