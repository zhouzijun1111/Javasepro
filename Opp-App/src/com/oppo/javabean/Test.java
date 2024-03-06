package com.oppo.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("波妞");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }

}
