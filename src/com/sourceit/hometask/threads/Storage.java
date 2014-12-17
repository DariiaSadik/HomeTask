package com.sourceit.hometask.threads;

import java.util.concurrent.TimeUnit;

public class Storage {
    private boolean flag;
    private int value;

    public synchronized int getValue() throws InterruptedException {
        while(!flag){
            wait();
        }
        System.out.println("Get " + value);
        flag = false;
        TimeUnit.SECONDS.sleep(1);
        notifyAll();
        return value;
    }

    public synchronized void setValue(int value) throws InterruptedException {
        while(flag){
            wait();
        }
        flag = true;
        TimeUnit.SECONDS.sleep(1);
        this.value = value;
        System.out.println("Set " + value);
        notifyAll();
    }

    public static void main(String[] args) {
        // Enter code to test Storage
        Storage storage = new Storage();
        new Thread(new Producer(storage)).start();
        new Thread(new Consumer(storage)).start();
    }
}
