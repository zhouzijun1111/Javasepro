package com.oppo;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] moneys = {9, 666, 188, 520, 99999};
        start(moneys);
    }
    public static void start(int[] moneys){

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("请您输入任意内容进行抽奖：");
            sc.next();

            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];

                if(money != 0){
                    System.out.println("恭喜您抽中了：" + money );
                    System.out.println();
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }
}
