package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("test.txt")) {
            doTest();
        } catch (SQLException | IOException ex) {
            System.out.println(ex);
        }
        System.out.println("其他程式...");
    }

    private static void doTest() throws SQLException, IOException {
        double random = Math.random();
        if (random < 0.35) {
            throw new SQLException("無法開啟資料庫!");
        } else if (random < 0.7) {
            throw new IOException("無法開啟檔案!");
        } else {
            System.out.println("系統運作正常...");
        }
    }

}
