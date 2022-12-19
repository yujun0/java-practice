package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        Path source = Paths.get("c:/com/sample/java/hello.txt");
        Path targe = Paths.get("c:", "com", "example", "python", "hi.txt");
        System.out.println("source：" + source);
        System.out.println("targe：" + targe);

        try {
            // 建立資料夾
            Files.createDirectories(source.getParent());
            Files.createDirectories(targe.getParent());

            // 建立檔案前先檢查檔案是否存在
            if (Files.exists(source)) {
                System.out.println(source.getFileName() + " 檔案已存在");
            } else {
                // 建立檔案
                Files.createFile(source);
                System.out.println(source.getFileName() + " 檔案建立完成");
            }

            // 判斷檔案是否可寫
            if (Files.isWritable(source)) {
                System.out.println(source.getFileName() + " 檔案可寫");
                // 建立集合
                ArrayList<String> list = new ArrayList<>();
                list.add("Java SE 8");
                list.add("巨匠電腦");
                list.add(LocalDateTime.now().toString());
                list.add("---------------------------------------------");
                // 資料寫入至hello.txt
                Files.write(source, list, StandardOpenOption.APPEND);

            } else {
                System.out.println(source.getFileName() + " 檔案不可寫");
            }

            // 檔案複製
            // Files.copy(source, targe, StandardCopyOption.REPLACE_EXISTING);

            // 檔案搬移
            // Files.move(source, targe, StandardCopyOption.REPLACE_EXISTING);

            // 檔案刪除
            // Files.delete(targe);

            // 測試
            Path testPath = Paths.get("c:\\com\\test\\temp.txt");
            //資料夾不存在執行複製
            //Files.copy(source, testPath, StandardCopyOption.REPLACE_EXISTING);
            // java.nio.file.NoSuchFileException: c:\com\sample\java\hello.txt -> c:\com\test\temp.txt

            // 刪除還有檔案的資料夾
            // Files.delete(source.getParent());
            // 如果檔案開啟中
            //java.nio.file.FileSystemException: c:\com\sample\java: 程序無法存取檔案，因為檔案正由另一個程序使用。
            // 資料夾中還有檔案
            // java.nio.file.DirectoryNotEmptyException: c:\com\sample\java

            //------------------
            // 複製下載網路圖片
            String url = "https://gjundisk01.blob.core.windows.net/it360/Forum/Article/393/9c4b4eff17f542748c05a7befe8a50b6.png";
            URI uri = URI.create(url);
            Path ocaPath = Paths.get("javaoca.png");
            try (InputStream in = uri.toURL().openStream()) {
                Files.copy(in, ocaPath, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("------------------------");

            // 走訪資料夾目錄檔案(單層)
            try (Stream<Path> files = Files.list(Paths.get("."))) {
                files.forEach(System.out::println);
            }
            System.out.println("------------------------");

            // 走訪資料夾目錄檔案(每一層)
            try (Stream<Path> files = Files.walk(Paths.get("."))) {
                files.forEach(System.out::println);
            }
            System.out.println("------------------------");

            // 讀取資料
            try (FileReader fr = new FileReader(source.toFile());
                 BufferedReader br = new BufferedReader(fr)) {
                br.lines().forEach(System.out::println);
            }

            System.out.println("==================================================");

            try (Stream<String> lines = Files.lines(source)) {
                lines.forEach(System.out::println);
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
