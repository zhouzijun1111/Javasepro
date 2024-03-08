package com.oppo.string;

import java.util.Random;

public class StringTest4 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }

    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }
}
