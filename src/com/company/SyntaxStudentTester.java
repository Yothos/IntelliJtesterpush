package com.company;

public class SyntaxStudentTester {
    public static void main(String[] args) {


        SyntaxStudents student1 = new SyntaxStudents();
        student1.name = "Pete";
        student1.age=23;
        student1.id="1256737";

        student1.displayFee();
        SyntaxStudents.schoolName="Syntax techs";
        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2=new SyntaxStudents();
        student2.name="Chen";
        student2.age=32;
        student2.id="87534757";
        System.out.println(SyntaxStudents.schoolName);



    }
}
