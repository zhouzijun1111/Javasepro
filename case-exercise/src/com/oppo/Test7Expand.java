package com.oppo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test7Expand {

    public static void main(String[] args) {

        int threads = Runtime.getRuntime().availableProcessors(); // 获取系统可用的处理器核心数
        ExecutorService executor = Executors.newFixedThreadPool(threads); // 创建一个固定大小的线程池

        final int start = 1000000000;
        final int end = 2000000000;
        AtomicInteger count = new AtomicInteger(); // 使用原子变量来进行线程安全的计数

        for (int i = 0; i < threads; i++) {
            final int segmentSize = (end - start + 1) / threads; // 计算每个线程应处理的数字范围
            final int segStart = start + i * segmentSize;
            final int segEnd = (i == threads - 1) ? end : segStart + segmentSize - 1;

            // 提交任务到线程池
            executor.submit(() -> {
                for (int num = segStart; num <= segEnd; num++) {
                    if (isPrime(num)) {
                        count.incrementAndGet(); // 如果是素数，则计数器加1
                        System.out.println(num); // 实时打印出素数
                    }
                }
            });
        }

        executor.shutdown(); // 关闭线程池
        while (!executor.isTerminated()) {
            // 等待所有任务完成
        }

        System.out.println("当前素数的个数是" + count.get()); // 打印出素数的个数
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        int sqrtN = (int)Math.sqrt(number) + 1;
        for (int i = 5; i <= sqrtN; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}