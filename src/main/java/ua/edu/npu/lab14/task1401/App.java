package ua.edu.npu.lab14.task1401;

import java.util.concurrent.Semaphore;

public class App {
        public static void main(String[] args) {
            Semaphore book = new Semaphore(1);

            new Thread(new MyThread("men", book)).start();
            new Thread(new MyThread("men 2 ", book)).start();

        }
}
