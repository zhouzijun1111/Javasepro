package com.oppo.define;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] money = {13,75,24,75,23,12};

        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("总额：" + sum);
    }
}
