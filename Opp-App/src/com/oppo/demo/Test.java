package com.oppo.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[1] = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨", "3.5万人想看");
        movies[2] = new Movie(3, "月球陨落",  42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
        movies[3] = new Movie(4, "一点就到家", 35, 8.7, "许宏宇", "刘昊然", "10.8万人想看");

        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchMovieById(3);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据id查询某个电影的详细信息展示");
            System.out.println("请您输入操作命令：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    operator.printAllMovies();
                    break;
                case 2:
                    System.out.println("请您输入查询的电影id：");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                default:
                    System.out.println("您输入的命令有问题");
            }
        }
    }
}
