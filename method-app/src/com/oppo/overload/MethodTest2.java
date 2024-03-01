package com.oppo.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        fire();
        fire("XM");
        fire("BT", 99);
    }
    public static void fire(){
//        System.out.println("默认给Sea Palaces发射一枚武器");
        fire("Sea Palaces");
    }
    public static void fire(String country){
//        System.out.println("发射了一枚武器给" + country);
        fire(country, 1);
    }
    public static void fire(String country, int number){
        System.out.println("发射了" + number + "枚武器给" + country);
    }
}
