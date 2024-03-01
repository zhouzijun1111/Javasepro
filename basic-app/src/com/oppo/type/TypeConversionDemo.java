package com.oppo.type;

public class TypeConversionDemo {
    public static void main(String[] args) {
        byte a = 12;
        int b = a + 8;
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(i);
        System.out.println(j);

        double size = 6.8;
        int storage = 16;
        boolean rs = size >= 6.95 & storage >=8;
        System.out.println(rs);
    }
}
