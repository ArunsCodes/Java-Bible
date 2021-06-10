package com.arunscodes.Basics;

public class MultiThreadingByThreadClass{
    public static void main(String[] args) {
        int n = 8;
        for(int i=0;i<n;i++){

             Multithread obj = new Multithread();
//            Thread obj = new Thread( new Multithread());
            obj.start();
        }
    }
}

class Multithread extends Thread{  //implements Runnable {
    public void run(){
        try{
            System.out.println("Thread " +Thread.currentThread().getId() +" is running");
        }catch (Exception e){
            System.out.println("Exception is caught.");
        }
    }
}
