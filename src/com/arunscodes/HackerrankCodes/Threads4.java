//package com.arunscodes.HackerrankCodes;
//
//public class Threads4 {
//    public static void main(String[] args) {
//        new Threads4().go();
//
//        () -> " Kitkat";
//        () -> { return "nul";};
//        (int i) -> return "James" + i;
//
//    }
//
//    public void go (){
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.print("foo");
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
//        t.start();
//    }
//
//    void wait4Signal(){
//        Object o = new Object();
//        synchronized (Thread.currentThread()){
//            ((Thread)o).wait();
//            o.notify();
//        }
//    }
//}
