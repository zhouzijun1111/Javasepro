package com.oppo.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(1,101);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您猜测的数据：");
            int guessNumber = sc.nextInt();

            if (guessNumber > luckNumber){
                System.out.println("您猜测的数字过大");
            } else if (guessNumber < luckNumber) {
                System.out.println("您猜测的数字过小");
            }else {
                System.out.println("恭喜您猜测成功！");
                break;
            }
        }
    }
}
