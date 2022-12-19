package com.sample;

import java.util.ArrayDeque;

public class MainClass {

    public static void main(String[] args) {
        ArrayDeque<String> fifo = new ArrayDeque<>();
        fifo.add("Kiwi");
        fifo.add("Apple");
        fifo.add("Orange");
        fifo.add("Banana");
        fifo.add("Apple");
        System.out.println("fifo：" + fifo);

        //取出不移除 peek()
        System.out.println("peek()：" + fifo.peek());
        System.out.println("fifo：" + fifo);

        //取出並移除 remove()
//        System.out.println("remove()：" + fifo.remove());
//        System.out.println("remove()：" + fifo.remove());
//        System.out.println("remove()：" + fifo.remove());
//        System.out.println("remove()：" + fifo.remove());
//        System.out.println("remove()：" + fifo.remove());
//        System.out.println("remove()：" + fifo.remove()); //沒有資料繼續取出會產生例外

        //取出並移除 poll()
        System.out.println("poll()：" + fifo.poll());
        System.out.println("poll()：" + fifo.poll());
        System.out.println("poll()：" + fifo.poll());
        System.out.println("poll()：" + fifo.poll());
        System.out.println("poll()：" + fifo.poll());
        System.out.println("poll()：" + fifo.poll());   //沒有資料繼續取出會回傳 null
        System.out.println("fifo：" + fifo);
        System.out.println("-----------------------");

        ArrayDeque<String> lifo = new ArrayDeque<>();
        lifo.push("Kiwi");
        lifo.push("Apple");
        lifo.push("Orange");
        lifo.push("Banana");
        lifo.push("Apple");
        System.out.println("lifo：" + lifo);

        while (lifo.size() > 0) {
            System.out.println("pop()：" + lifo.pop());
        }
        System.out.println("lifo：" + lifo);
    }

}
