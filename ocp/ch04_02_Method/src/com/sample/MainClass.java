package com.sample;

public class MainClass {

    public static void main(String[] args) {
        // 呼叫類別成員
        // 語法：類別名稱.類別成員
        // 呼叫 類別成員 【欄位】
        System.out.println("int 最大值：" + Integer.MAX_VALUE);
        // 呼叫 類別成員 【方法】
        System.out.println("亂數：" + Math.random());

        // 呼叫物件成員
        // 語法：物件參考名稱.物件成員
        // 先建立物件
        Book book = new Book();
        // 呼叫 物件成員 【欄位】
        book.name = "Java SE 8";
        book.price = 800;
        // 呼叫 物件成員 【方法】
        book.display();

        //------------------------------
        // 呼叫設值方法，將資料交給方法指定給欄位
        book.setFields("Python 3.8", 700);
        book.display();

        System.out.println("呼叫物件成員 test()...");
        book.test1();

        System.out.println("呼叫類別成員 doTest()...");
        Book.doTest();

        System.out.println("-----------------");

        // 呼叫同類別中的類別成員
        calculate1(10);

        // 呼叫物件成員
        // calculate2(5, 3);       //直接呼叫物件成員錯誤
        MainClass mClass = new MainClass();   // 建立物件
        mClass.calculate2(5, 3);   // 透物物件呼叫物件成員

    }

    // 類別成員
    private static void calculate1(int x) {
        System.out.println(x + "/2=" + (x / 2));
    }

    // 物件成員
    private void calculate2(int x, int y) {
        System.out.println(x + "+" + y + "=" + (x + y));
    }

}
