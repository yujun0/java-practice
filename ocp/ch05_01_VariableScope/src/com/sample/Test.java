package com.sample;

public class Test {

    // 方法
    public void setItem(String i) {  // 參數 i 有效範圍開始
        System.out.println("i = " + i);

        // System.out.println("temp = " + temp);

        String temp = "項目：" + i;  // 區域變數 temp 有效範圍開始
        System.out.println("temp = " + temp);

        item = "# " + temp;
        System.out.println("item = " + item);

    }// 參數 i 有效範圍結束、區域變數 temp 有效範圍結束


    public String getItem() {
        // System.out.println("i = " + i);
        // System.out.println("temp = " + temp);
        return item;
    }

    // 宣告欄位
    private String item;

}
