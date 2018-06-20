package cn.ws.test;

import org.junit.Test;

public class TestThread {

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        thread2.run();
    }

}
