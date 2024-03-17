package com.arunscodes.DataStructures.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapImpl {

    public static void main(String[] args) {

        //Hashmap Impl

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1,"Arun");
        hm.put(2,"Momo");
        hm.put(3,"Popo");

        System.out.println("Value for 1 is .... : "+hm.get(1));

        for(Map.Entry<Integer,String> e : hm.entrySet()){
            System.out.println(e.getKey() +" " + e.getValue());
        }

        HashMap<String,Integer> hm2 = new HashMap<>();

        hm2.put("abc", 1);
        hm2.put(new String("abc"), 2);
        hm2.put(new String("abc"), 3);
        hm2.put("abc", 4);

        System.out.println("new String -" +hm2.get(new String("abc")));

        System.out.println(hm2.get("abc"));


        for(Map.Entry<String, Integer> e : hm2.entrySet()){
            System.out.println(e.getKey() +" " + e.getValue());
        }
    }

}
