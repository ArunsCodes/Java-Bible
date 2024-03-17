package com.arunscodes.DataStructures.Collections;

import java.util.*;

/* A set is an unordered collection of objects in which duplicate values cannot be stored.
    This collection is used when we don't want duplicate elements in our data.
 */


public class SetImpl {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();


        //Hashset implementation

        /* Hash set is a direct implementation of the hash table. It's important points are as follows:
            1. It doesn't necessarily store in order, it stores on the basis of the hash values.
            2. We can add null values to it too.
            3. It won't store repeated values.
         */
        System.out.println("==== Hash Set Representation ====");

        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        HashSet<Integer> copySet = new HashSet<>();
        copySet.add(1);
        copySet.addAll(hashSet);

        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }

        System.out.println();

        /* Linked HashSet Implementation.
            This is very similar to hashset, but it uses doubly linked lists to store the data in an order.
         */

        System.out.println("==== Linked Hash Set Representation ====");

        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);

        Iterator<Integer> iterator2 = linkedHashSet.iterator();

        while (iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");
        }

        //TreeSet Impl
        System.out.println("==== Tree Set Representation ====");


        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        Iterator<Integer> iterator3 = treeSet.iterator();

        while (iterator3.hasNext()){
            System.out.print(iterator3.next() + " ");
        }
    }
}
