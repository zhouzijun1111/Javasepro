package com.oppo;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(1000,8,"经济舱");
        System.out.println("优惠价是：" + price);
    }
    public static double calculate(double price, int month, String type){
        if (month >=5 && month <= 10){
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            switch (type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
