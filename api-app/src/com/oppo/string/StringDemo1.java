package com.oppo.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String name = "ohh!";
        System.out.println(name);

        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("oppo");
        System.out.println(rs2);

        char[] chars = {'a', '马', '马'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97,98,99};
        String rs4 = new String(bytes);
        System.out.println(rs4);
    }
}
