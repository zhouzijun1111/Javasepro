package com.oppo;

public class Test9 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1) ; j++) {
                System.out.print(j % 2 == 0 ? " ": "*");
            }
            System.out.println();
        }
    }
}
