package com.arunscodes.HackerrankCodes;

public class Main {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = s1;
        s1+="d";
        System.out.println(s1 +" " +s1 + " " +(s1==s2));
    }
}
