package com.sample;

public class MainClass {

    public static void main(String[] args) {
        doTest(10);
        System.out.println("\n----------");
    }

    private static void doTest(int i) {
        System.out.printf("%3d", i);
        if (i <= 1) {
            return;  //中斷方法執行 
        } else {
            doTest(i - 1);
        }
        System.out.printf("%3d", i);
    }

}
