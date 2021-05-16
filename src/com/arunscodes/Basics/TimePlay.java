package com.arunscodes.Basics;

public class TimePlay {

    public static void main(String[] args) {
        System.out.println("I'm going to show a fun game! Are you ready??");
        try {
            Thread.sleep(5000);

            System.out.println("Let me show you how to slow time!!!" +
                    "\n Usually it is easy to build a pyramid!");

            Thread.sleep(2000);
            makePyramid();

            System.out.println("JUST LIKE THAT!!!");
            Thread.sleep(2000);

            System.out.println("Now I'm gonna slow down for you!!! watch... ABRACADABRA!!!");
            makePyramidSlow();

            System.out.println("See ya!");
            Thread.sleep(2000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void makePyramid(){
        int rows = 5, k = 0 ;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void makePyramidSlow() throws InterruptedException {
        int rows = 5, k =0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                Thread.sleep(700);
                System.out.print("* ");
                ++k;
            }

            Thread.sleep(700);
            System.out.println();
        }
    }
}
