package com.arunscodes.HackerrankCodes;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        String str = new String("MSG");
        str = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("End of main");
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize");
    }
}
