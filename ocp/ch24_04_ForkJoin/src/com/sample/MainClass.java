package com.sample;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        int n = 50;
//        System.out.println("使用遞迴...");
//        Instant t1 = Instant.now();
//        System.out.println("t1：" + t1.toString());
//        System.out.printf("第 %d 項：%d%n", n + 1, FibonacciTask.fibonacci(n));
//        Instant t2 = Instant.now();
//        System.out.println("使用遞迴時間：" + Duration.between(t1, t2).toMillis()+ "毫秒");
//        System.out.println("-------------");

//        System.out.println("使用 Fork/Join...");
//        int processors = Runtime.getRuntime().availableProcessors();
//        System.out.println("processors：" + processors);
//        Instant t3 = Instant.now();
//        FibonacciTask task = new FibonacciTask(n);
//        ForkJoinPool pool = new ForkJoinPool(processors);
//        System.out.printf("第 %d 項：%d%n", n + 1, pool.invoke(task));
//        Instant t4 = Instant.now();
//        System.out.println("使用Fork/Join時間：" + Duration.between(t3, t4).toMillis()+ "毫秒");
//        System.out.println("-------------");

        System.out.println("使用 Java 8 Stream...");
        Instant t5 = Instant.now();
        List<Long> list = Stream.iterate(new long[]{0, 1}, i -> new long[]{i[1], i[0] + i[1]})
                .limit(n + 1)
                .peek(i -> System.out.println(i[0] + "\t" + i[1]))
                .map(i -> i[0])
                .sequential() //循序處理
                //.parallel()     //平行處理
                .collect(Collectors.toList());
        Instant t6 = Instant.now();
        System.out.printf("第 %d 項：%d%n", n + 1, list.get(list.size() - 1));
        System.out.println("使用Java 8 Stream時間：" + Duration.between(t5, t6).toMillis() + "毫秒");
        //12586269025
    }

}
