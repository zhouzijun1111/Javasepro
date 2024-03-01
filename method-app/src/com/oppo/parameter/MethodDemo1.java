package com.oppo.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        chang(a);
        System.out.println(a);
    }
    public static void chang(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
