package ua.edu.npu.lab14.task1401;

import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {
    String name;
    Semaphore book;

    MyThread(String n, Semaphore b) {
        name = n;
        book = b;
    }


    public void run() {
        System.out.println(name + " обирає книгу.");

        try {
            System.out.println(name + " очікує книгу.");
            book.acquire();
            System.out.println(name + " отримує книгу.");

            for (int i = 0; i < 5; i++) {
                Shared.count--;

            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + "повертає книгу.");
        book.release();
    }
}
