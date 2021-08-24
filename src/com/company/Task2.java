package com.company;

public class Task2 {
    public static void main(String[] args) {
        String str="String I want to reverse";
        String []arr=str.split(" ");
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder=new StringBuilder(arr[i]);
            stringBuilder.reverse()
            ;
            arr[i]=stringBuilder.toString();
        }
        System.out.println(arr[0]);
    }
}
