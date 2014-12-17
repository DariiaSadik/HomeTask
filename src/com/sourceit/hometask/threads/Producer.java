package com.sourceit.hometask.threads;

/**
 * Class represents Producer functionality, which permanently place numbers into the storage.
 *
 * Constructor of the class should accept an instance of Storage class and start the Thread.
 */
public class Producer implements Runnable {
    private Storage ref;

    public Producer(Storage ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            try {
                ref.setValue(count++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
