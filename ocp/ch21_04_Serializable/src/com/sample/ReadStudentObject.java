package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentObject {

    public static void main(String[] args) {
        // 反序列化
        try (FileInputStream fis = new FileInputStream("amy.student");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = (Student) ois.readObject();
            System.out.println("Name：" + student.getName());
            System.out.println("Total：" + student.getTotal());
            System.out.println("Averege：" + student.getAverage());
            System.out.println("DateTime：" + student.getLocalDateTime());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

}
    
