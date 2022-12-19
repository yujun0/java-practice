package com.sample;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementID implements IEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID：");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + ID + "=?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.printf("%d --> %s, %s, %s, %d%n", rs.getInt(ID), rs.getString(FIRST_NAME), rs.getString(LAST_NAME), rs.getString(BIRTHDAY), rs.getInt(SALARY));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
