package com.oppo.branch;

public class SwitchDemo {
    public static void main(String[] args) {
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("写代码");
                break;
            case "周二·":
                System.out.println("吃烧烤");
                break;
            case "周三":
                System.out.println("学瑜伽");
                break;
            case "周四":
                System.out.println("打豆豆");
                break;
            case "周五":
                System.out.println("看电影");
                break;
            case "周六":
                System.out.println("睡大觉");
                break;
            case "周日":
                System.out.println("被开除");
                break;
            default:
                System.out.println("您输入的信息不存在");
        }
    }
}
