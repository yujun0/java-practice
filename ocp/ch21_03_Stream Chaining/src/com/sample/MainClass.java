package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class MainClass {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] input = new String[3];

        try (FileWriter fw = new FileWriter("log.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            // 接收鍵盤資料
            System.out.print("帳號：");
            input[0] = br.readLine();
            System.out.print("密碼：");
            input[1] = br.readLine();
            input[2] = LocalDateTime.now().toString();

            // 寫入檔案
            for (String s : input) {
                bw.write(s);
                bw.newLine();
            }
            bw.write("---------------------------");
            bw.newLine();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
