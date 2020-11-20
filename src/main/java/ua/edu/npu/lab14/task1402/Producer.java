package ua.edu.npu.lab14.task1402;

public class Producer implements Runnable{

    Q q;

    Producer(Q q){
        this.q =q;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            q.put(3);
        }

    }
}
