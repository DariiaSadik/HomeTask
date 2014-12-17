package com.sourceit.hometask.threads;

/**
 * Class represents Consumer functionality, which permanently get the number from the storage.
 *
 * Constructor of the class should accept an instance of Storage class and start the Thread.
 */
public class Consumer implements Runnable {
    private Storage ref;

    public Consumer(Storage ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println(ref.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
