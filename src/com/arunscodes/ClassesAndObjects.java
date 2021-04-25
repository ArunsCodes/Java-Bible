package com.arunscodes;

public class ClassesAndObjects {

    int age;

    public ClassesAndObjects(){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public ClassesAndObjects(String name){

        System.out.println("The name is : "+name);
    }

    public static void main(String[] args) {
        ClassesAndObjects classesAndObjects = new ClassesAndObjects("puppy");
        classesAndObjects.setAge(2);

        System.out.println("The puppy's age is : " +classesAndObjects.getAge());
    }
}
