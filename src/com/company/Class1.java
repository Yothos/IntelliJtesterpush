package com.company;

public class Class1 {
    public static void main(String[] args) {
        String str = "adagfagaAHGJBD*!^#&$12345767dfg";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
