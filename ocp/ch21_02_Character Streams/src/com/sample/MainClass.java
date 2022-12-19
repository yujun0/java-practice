package com.sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {
        String temp = "This is a book. 這是一本書。售價：NT$：800";

        File file = new File("test.txt");//檔案位置：ch21_02 專案資料夾

        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {
            //儲存
            fw.write(temp);
            System.out.println("資料存檔完成\n--------------------------------");

            //強迫寫入
            fw.flush();

            //讀取
            int read;
            while ((read = fr.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println("資料讀取完成\n--------------------------------");

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
