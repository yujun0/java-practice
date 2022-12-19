package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MainClass {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new Lotto("Amy"));
        es.execute(new Lotto("Lisa"));
        es.execute(new Lotto("Jackie"));
        es.shutdown();
    }

}

//-----------------------------------------
class Lotto implements Runnable {

    private String name;
    private static final ReentrantLock reentrantLock = new ReentrantLock();

    public Lotto(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            reentrantLock.lock();
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                Thread.sleep(new Random().nextInt(1234));
                int random = new Random().nextInt(49) + 1;
                System.out.println(name + "\t" + random + "\t" + lotto.add(random));
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        } finally {
            reentrantLock.unlock();
        }
    }

}
