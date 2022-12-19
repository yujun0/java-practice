package com.sample;

public class Consumer extends Thread {

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                store.consumer(3);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
