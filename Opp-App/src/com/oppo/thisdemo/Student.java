package com.oppo.thisdemo;

public class Student {
    double score;

    public void printThis(){
        System.out.println(this);
    }
    public void printPass(double score){
        if (this.score > score){
            System.out.println("恭喜您，您成功考入了哈佛大学！");
        }else {
            System.out.println("落选了");
        }
    }
}
