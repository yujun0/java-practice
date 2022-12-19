package com.sample;

public class Producer extends Thread {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                store.producer(4);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
