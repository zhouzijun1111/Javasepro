package com.oppo.define;

public class MethodTest3 {
    public static void main(String[] args) {
        int rs = add(5);
        System.out.println("1-5的和是：" + rs);

        int rs2 = add(100);
        System.out.println("1-100的和是：" + rs2);

        System.out.println("--------------------------------------");

        judge(10);
        judge(7);
    }

    public static void judge(int number){
        if(number % 2 == 0){
            System.out.println(number + "是偶数");
        }else {
            System.out.println(number + "是奇数");
        }
    }

    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
