package com.company;

public class InstanceVarDemo {
    int[] arr={10,20,30,40};
    int sum=0;

    void sum(){
        for (int i:arr){
            sum+=i;
        }
    }
    void calculateAverage(){
        System.out.println(sum/arr.length);
    }
}
