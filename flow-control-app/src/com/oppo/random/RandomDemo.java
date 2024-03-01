package com.oppo.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 20; i++) {
            int date = r.nextInt(5,11);
            System.out.println(date);
        }
    }
}
