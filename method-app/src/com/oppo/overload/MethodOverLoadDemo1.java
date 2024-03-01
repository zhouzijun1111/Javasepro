package com.oppo.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(100);
    }
    public static void test(){
        System.out.println("test1");
    }

    public static void test(int a){
        System.out.println("test2" + a);
    }
    void test(double a){

    }
    int test(int a ,int b){
        return a + b;
    }
}
