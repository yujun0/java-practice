package com.sample;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        // 宣告整數陣列長度6
        int[] lotto = new int[6];
        boolean boo;

        do {
            boo = false; // 先設定 boo 為 false 代表不重複  
            // 產生號碼
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = new Random().nextInt(49) + 1;  //亂數產生 1-49 任意整數
            }

            // 檢查
            // 外  內
            // [0][1]    [1][2]    [2][3]    [3][4]    [4][5]
            // [0][2]    [1][3]    [2][4]    [3][5]    
            // [0][3]    [1][4]    [2][5]    
            // [0][4]    [1][5]    
            // [0][5]   

            //幫迴圈命名
            outer:
            for (int i = 0; i < lotto.length - 1; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    //檢查重複
                    if (lotto[i] == lotto[j]) {
                        System.out.printf("%02d --> 索引位置 [%d] 和 [%d] 相同%n", lotto[j], i, j);
                        boo = true;   //設定 boo 為 true 代表有重複號碼  
                        break outer;
                    }
                    // 比較大小
                    if (lotto[i] > lotto[j]) {
                        int temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }
            System.out.println("-----");
        } while (boo); //如果 boo 為 true，do-while重新執行

        // 顯示號碼
        for (int i : lotto) {
            System.out.printf("%02d | ", i);
        }

        System.out.println();
    }

}
