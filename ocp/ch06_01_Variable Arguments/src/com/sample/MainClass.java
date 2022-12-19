package com.sample;

public class MainClass {

    public static void main(String[] args) {
        average(10, 20);
        average(10, 20, 30);
        average(10, 20, 30, 40, 50);
        average(10, 20, 30, 40, 50, 60, 70, 80, 80, 100);
    }

    private static void average(int... scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        System.out.println("total：" + total);
        System.out.println("average：" + total / scores.length);
        System.out.println("---------------");
    }

    // private void test1(int... i, double... d){}
    // private void test2(String... s, String s1){}
    private void test3(int i, String s, double... d) {
    }

    private void test4(String s, int i, int... i1) {
    }

}
