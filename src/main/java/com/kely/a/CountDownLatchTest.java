package com.kely.a;

import java.util.concurrent.CountDownLatch;

/**
 * @see http://ifeve.com/talk-concurrency-countdownlatch/
 */
public class CountDownLatchTest {

    static CountDownLatch c = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(2);
                c.countDown();
            }
        }).start();

        c.await();
        System.out.println("3");
    }

}