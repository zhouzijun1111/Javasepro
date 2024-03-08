package com.oppo.string;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入登录名称：");
            String loginName = sc.next();
            System.out.println("请您输入登录密码：");
            String passWord = sc.next();

            boolean rs = login(loginName, passWord);
            if (rs){
                System.out.println("恭喜您，欢迎进入系统");
                break;
            }else {
                System.out.println("登录名或者密码错误，请您确认");
            }
        }
    }

    public static boolean login(String loginName, String passWord){
        String okloginName = "oppo";
        String okPassword = "123456";

/*        if (okloginName.equals(loginName) && okPassword.equals(passWord)){
            return true;
        }else {
            return false;
        }
*/
        return okloginName.equals(loginName) && okPassword.equals(passWord);
    }
}
