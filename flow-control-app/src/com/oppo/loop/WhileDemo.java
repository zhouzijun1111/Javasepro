package com.oppo.loop;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1){
            System.out.println("你好");
            i++;
        }

        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;

        while (paperThickness < peakHeight){
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要折叠 " + count + " 次");
        System.out.println(paperThickness);
    }
}
