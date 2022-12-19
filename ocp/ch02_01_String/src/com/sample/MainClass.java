package com.sample;

public class MainClass {

    public static void main(String[] args) {
        // String( 類別，字串使用一對雙引號【" 文字 "】
        String s1 = "JAVA";
        String s2 = "java";
        String s3 = "java";
        String s4 = new String("java");
        String s5 = new String("java");

        // 使用 【==】 是比較記憶體位址
        System.out.println("s2==s3：" + (s2 == s3)); //true
        System.out.println("s4==s5：" + (s4 == s5)); //false

        // 比較字串內容
        System.out.println("s1.equals(s5) 大小寫不同：" + s1.equals(s5));
        System.out.println("s1.equalsIgnoreCase(s5) 大小寫相同：" + s1.equalsIgnoreCase(s5));
        System.out.println("-------------------");

        // 字串串接
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";

        //a + b;  // 編譯失敗 + 的左邊沒有 = 號
        String temp1 = a + b; // a、b 串接
        System.out.println("1. temp1：" + temp1); //AB
        temp1.concat(c);          // concat() 字串串接
        System.out.println("2. temp1：" + temp1); //AB
        temp1 = temp1.concat(c);
        System.out.println("3. temp1：" + temp1); //ABC

        String temp2 = a + b;
        temp2 = temp2 + c;
        temp2 = temp2 + d;
        System.out.println("temp2：" + temp2);

        StringBuilder temp3 = new StringBuilder();
        temp3.append(a).append(b);
        temp3.append(c);
        temp3.append(d);
        System.out.println("temp3：" + temp3);
        System.out.println("--------------------------");

        // 常用方法
        String str = " This is a book. 這是一本書。 ";
        System.out.println("012345678901234567 89 0 12 3");
        System.out.println(str);
        System.out.println("str字串長度：" + str.length());
        System.out.println("第 10 個字元：" + str.charAt(9));
        System.out.println("轉大寫：" + str.toUpperCase());
        System.out.println("轉小寫：" + str.toLowerCase());
        str = str.trim(); // 去除首尾空白符號
        System.out.println("str字串長度：" + str.length());
        System.out.println("01234567890123456 78 90 1");
        System.out.println(str);

        System.out.println("str.substring(8)：" + str.substring(8));
        System.out.println("str.substring(10, 14)：" + str.substring(10, 14));
        System.out.println("是否是 This 開始：" + str.startsWith("This"));
        System.out.println("是否是 一本書。 結束：" + str.endsWith("一本書。"));
        System.out.println("book 開始出現的索引值：" + str.indexOf("book"));

        System.out.println("-------------------------");
        byte a1 = Byte.parseByte("1");  //-128~127
        short a2 = Short.parseShort("2");
        int a3 = Integer.parseInt("3");
        long a4 = Long.parseLong("4");
        float a5 = Float.parseFloat("5.0");
        double a6 = Double.parseDouble("6.0");
        System.out.println(a1 + a2 + a3 + a4 + a5 + a6);
    }

}
