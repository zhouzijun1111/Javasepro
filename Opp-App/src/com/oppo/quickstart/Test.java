package com.oppo.quickstart;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAVERAGEScore();

        Student s2 = new Student();
        s2.name = "波仔";
        s2.chinese = 100;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAVERAGEScore();
    }
}
