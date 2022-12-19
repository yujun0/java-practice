package com.sample;

public class Book {
    // 欄位：物件成員  
    public String name;
    public int price;

    // 欄位：類別成員
    public static int a;

    // 方法 
    // 語法：[存取修飾] 修飾字 回傳型別 方法名稱(參數列){...}
    // 方法：物件成員  
    public void display() {
        System.out.println("Name：" + name);
        System.out.println("Price：" + price);
        System.out.println("---------------");
    }

    // 設值方法
    public void setFields(String name, int price) {
        // 使用 this (this：這個物件)
        this.name = name;
        this.price = price;
    }

    // 測試
    public void test1() {  // 物件成員方法：可以呼叫其他物件成員和類別成員
        System.out.println(name);// 物件成員
        System.out.println(a);// 類別成員
        display();// 物件成員
        test2();// 類別成員
    }

    public static void doTest() {  // 類別成員方法：只可以呼叫類別成員
        // System.out.println(name);// 物件成員  錯誤
        System.out.println(a);// 類別成員
        // display();// 物件成員  錯誤
        test2();// 類別成員
    }

    public static void test2() {
        System.out.println("static test2()...");
    }

}
