package com.oppo;

public class Test7_2 {
    public static void main(String[] args) {
        int count = 0;

        OUT:
        for (int i = 101; i <= 200 ; i++) {
            for (int j = 2; j <= i / 2 ; j++) {
                if (i % j == 0){
                    continue OUT;
                }
            }
            count ++;
            System.out.println(i);
        }
        System.out.println("个数是" + count);
    }
}
