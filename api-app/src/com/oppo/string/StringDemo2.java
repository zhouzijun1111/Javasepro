package com.oppo.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "民主自由法治";
        System.out.println(s.length());

        char c = s.charAt(1);
        System.out.println(c);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("------------------------------");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String s1 = new String("自由");
        String s2 = new String("自由");
        System.out.println(s1.equals(s2));

        String c1 = "90SoYj";
        String c2 = "90sOyj";
        System.out.println(c1.equalsIgnoreCase(c2));

        String s3 = "黎明到来之前，只需蛰伏";
        System.out.println(s3.substring(0, 6));

        System.out.println(s3.substring(7));

        String info = "垃圾游戏，毁我青春！";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        System.out.println(info.contains("游戏"));

        System.out.println(s3.startsWith("黎明"));

        String rs5 = "张无忌,赵敏,周芷若,殷素素";
        String[] names= rs5.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
