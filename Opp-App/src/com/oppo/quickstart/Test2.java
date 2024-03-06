package com.oppo.quickstart;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.chinese);
        System.out.println(s.math);

        Student s1 = new Student();
        s1.name = "张三";

        Student s2 = s1;
        s2.name = "李四";

        System.out.println(s1.name);
    }
}
