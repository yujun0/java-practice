package com.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        // 未指定型別：加入集合的資料皆會轉型為 Object
        ArrayList objList = new ArrayList();
        // 加入集合元素
        objList.add(100);
        objList.add(1.23);
        objList.add('A');
        objList.add(true);
        objList.add("Java");
        // 簡易方式顯示集合內容
        System.out.println("objList：" + objList.toString());
        // 在指定位置加入元素
        objList.add(1, "Java");
        System.out.println("objList：" + objList);
        // get(index) 取出指定位置元素
        System.out.println("get(1)：" + objList.get(1));
        // System.out.println("get(2)：" + objList.get(2)*100);       // 取出的元素為 Object 所以不可以計算
        System.out.println("get(2)：" + (double) objList.get(2) * 100);  // 取出的元素必須轉型回原型別才可以操作
        // size() 取出集合的元素個數
        System.out.println("size()：" + objList.size());
        System.out.println("------------------");

        // 指定型別
        ArrayList<String> strList = new ArrayList<>();
        // strList.add(100);  // 已經指定 String 就不可以加入其他型別元素
        strList.add("Java");
        strList.add("Android");
        strList.add("Java");
        strList.add("Python");
        strList.add("c#");
        strList.add(new String(new char[]{'J', 'a', 'v', 'a'}));
        strList.add("MySQL");

        // 使用一般 for 迴圈
        for (int i = 0; i < strList.size(); i++) {
            System.out.printf("%s | ", strList.get(i));
        }
        System.out.println("\n-----------------");

        System.out.println("strList.indexOf(\"Python\")：" + strList.indexOf("Python"));
        System.out.println("strList.indexOf(\"mysql\")：" + strList.indexOf("mysql"));
        int index = strList.indexOf("mysql");
        System.out.println("strList.indexOf(\"mysql\")：" + (index >= 0 ? strList.get(index) : "找不到指定元素"));

        System.out.println("strList.set(2, \"JavaSE\")：" + strList.set(2, "JavaSE"));

        System.out.println("strList.remove(4)：" + strList.remove(4));
        System.out.println("strList.remove(\"Java\")：" + strList.remove("Java"));

        // 增強型迴圈
        for (String s : strList) {
            System.out.printf("%s | ", s);
        }
        System.out.println("\n-----------------");

        // 清除集合元素
        strList.clear();
        System.out.println("strList 是否是空集合：" + strList.isEmpty());
        System.out.println("strList：" + strList);

        System.out.println("------------------------");

        // 建立 String 陣列
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick", "Amy", "Lisa", "Jackie"};
//        List<String> myList = Arrays.asList(names);
//        System.out.println("myList：" + myList);
//        ArrayList<String> myArrayList = new ArrayList(myList);
//        System.out.println("myArrayList：" + myArrayList);

        // 可改寫成        
        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(names));
        System.out.println("myArrayList：" + myArrayList);

        System.out.println("--------------------");
        for (String s : myArrayList) {
            System.out.printf("%s | ", s.toUpperCase());
        }
        System.out.println("\n--------------------");
        System.out.println("1. myArrayList：" + myArrayList);

        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.set(i, myArrayList.get(i).toUpperCase());
        }
        System.out.println("2. myArrayList：" + myArrayList);
        System.out.println("-----------------");

        // 使用 lambda 將所有字串轉成小寫
        myArrayList.replaceAll(s -> s.toLowerCase());
        System.out.println("3. myArrayList：" + myArrayList);

        // 使用 lambda 刪除第一個符號是 j 的元素
        myArrayList.removeIf(s -> s.startsWith("j"));
        System.out.println("4. myArrayList：" + myArrayList);

        // 使用 lambda 刪除字串長度 <= 4 元素
        myArrayList.removeIf(s -> s.length() <= 4);
        System.out.println("5. myArrayList：" + myArrayList);
    }

}
