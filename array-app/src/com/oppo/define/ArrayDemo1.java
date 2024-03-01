package com.oppo.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] ages = new int[]{12,34,53,42};
        double[] scores = new double[]{89.2,67.2,90.57,2.3};

        int[] arr = {12,24,36};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 66;
        System.out.println(arr[0]);

        System.out.println(arr.length);

    }
}
