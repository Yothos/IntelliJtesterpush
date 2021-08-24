package com.company;

public class Dog {
    static int numOfLegs=4;
    String name;
    String Breed;
    String color;

    void bark(){
        int times = 10;
        for (int i=0;i<times;i++){
            System.out.println("Dog can bark");
        }
    }
}
