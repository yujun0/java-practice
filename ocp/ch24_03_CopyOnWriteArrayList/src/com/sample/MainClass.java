package com.sample;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(String.format("M%02d", i));
        }
//        
//        Test test = new Test(list);
//        Thread thread = new Thread(test, "test");
//        thread.start();

        ExecutorService es = Executors.newCachedThreadPool();
        Test test = new Test(list);
        es.submit(test);
        es.submit(test);
        es.submit(test);
        es.shutdown();

        for (String s : list) {
            System.out.println(Thread.currentThread().getName() + "\t" + s + "\t" + list);
        }
    }
}

//---------------------------

class Test implements Runnable {

    private List<String> list;

    public Test(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 20; i < 25; i++) {
            list.add(String.format("T%02d", i));
            System.out.println(Thread.currentThread().getName() + "\t" + list);
        }
    }

}
