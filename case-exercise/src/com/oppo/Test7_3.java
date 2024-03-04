package com.oppo;

public class Test7_3 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i <= 200 ; i++) {
            if (check(i)){
                System.out.println(i);
                count = count + 1;
            }
        }
        System.out.println("素数的个数是" + count);
    }

    public static boolean check(int data){
        for (int i = 2; i <= data / 2 ; i++) {
            if (data % i ==0){
                return false;
            }
        }
        return true;
    }
}
