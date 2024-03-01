package com.oppo.branch;

public class IfDemo {
    public static void main(String[] args) {
        double t = 36.9;
        if (t > 37){
            System.out.println("温度异常");
        }

        double money = 89;
        if (money > 90){
            System.out.println("发红包成功");
        } else {
            System.out.println("余额不足");
        }

        int score = 298;
        if (score >= 0 && score < 60){
            System.out.println("您的绩效级别是：D");
        } else if (score >= 60 && score < 80) {
            System.out.println("您的绩效级别是：C");
        } else if (score >= 80 && score < 90) {
            System.out.println("您的绩效级别是：B");
        } else if (score >= 90 && score <= 100) {
            System.out.println("您的绩效级别是：A");
        }else {
            System.out.println("您录入的分数有问题");
        }
    }
}
