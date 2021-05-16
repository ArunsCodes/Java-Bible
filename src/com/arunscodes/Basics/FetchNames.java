package com.arunscodes.Basics;
import java.util.Scanner;


//Simple input & output with names
public class FetchNames {

    private static String name;

    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        System.out.println("Entered name :" +name);
    }

}
