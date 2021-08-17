package com.arunscodes.HackerrankCodes;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable{
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Demo {

    public static void main(String[] args) {
        Person p1 = new Person("ABC");
        Person p2 = new Person("BCD");
        Person p3 = new Person("DEF");
        Person p4 = new Person("ABC");

        Set<Person> t = new TreeSet<Person>();
        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);
        System.out.println(t.size());
    }
}
