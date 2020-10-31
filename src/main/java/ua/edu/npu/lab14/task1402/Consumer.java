package ua.edu.npu.lab14.task1402;

public class Consumer implements Runnable {

    Q q;


    Consumer (Q q){
        this.q =q;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            q.get(2);
        }
    }
}
