package com.oppo;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        int[] userNumbers = userSelectNumber();
        System.out.println("您投注的号码：");
        printArray(userNumbers);

        int[] luckNumber = createLuckNumber();
        System.out.println("中奖号码：");
        printArray(luckNumber);

        judge(userNumbers,luckNumber);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length -1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    public static int[] userSelectNumber(){

        int [] numbers = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length - 1; i++) {

            while (true) {
                System.out.println("请您输入第" + (i +1) + "个红球号码（1-33之间，不能重复）：");
                int number = sc.nextInt();

                if (number < 1 || number > 33){
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认！");
                }else {
                    if (exist(numbers, number)) {
                        System.out.println("对不起。您当前输入的号码重复，请重新输入！");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请您输入最后1个蓝球号码（1-16）：");
            int number = sc.nextInt();
            if (number < 1 || number > 16){
                System.out.println("对不起，您输入的蓝球号码不对！");
            }else {
                numbers[6] = number;
                break;
            }
        }

        return numbers;
    }
    public static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }
    public static int[] createLuckNumber(){
        int[] numbers = new int[7];

        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {

            while (true) {

                int number = r.nextInt(1,34);

                if (!exist(numbers,number)){

                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(1,17);
        return numbers;
    }
    public static void judge(int[] userNumbers,int[] luckNumber){
        
        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumber.length - 1; j++) {
                if (userNumbers[i] == luckNumber[j]){
                    redCount++;
                    break;
                }
            }
        }

        blueCount = userNumbers[6] == luckNumber[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜您，中奖1000万，可以开始享受人生了~~");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜您，中奖500万，可以稍微开始享受人生了~~~");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜您，中奖3000元，可以出去吃顿小龙虾了~");
        }else if(redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("恭喜您，中了小奖：200元~");
        }else if(redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("中了10元~");
        }else if( redCount < 3 && blueCount == 1){
            System.out.println("中了5元~");
        }else{
            System.out.println("感谢您对福利事业做出的巨大贡献~~~");
        }
    }
}
