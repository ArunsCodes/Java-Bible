package com.arunscodes.HackerrankCodes;

public class Parent{
    private void display() {
        System.out.println("In P");
    }
}

class Child extends Parent{
    public void display(){
        System.out.println("In C");
    }
}

class test{
    public static void main(String[] args) {
        Parent p = new Child();
//        p.display();
    }
}
