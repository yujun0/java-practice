package com.sample;

public class Test {

    // 類別成員(static)
    public static void staticTest(String s) {
        System.out.print(s.toUpperCase() + " | ");
    }

    // 類別成員
    public void instanceTest(String s) {
        System.out.printf("%s%n", s);
    }

}
