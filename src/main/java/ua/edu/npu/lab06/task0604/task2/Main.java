package ua.edu.npu.lab06.task0604.task2;

import java.util.Random;

public class Main implements Interface {

    public static void main(String[] args) {
        Main main = new Main();
        main.method(9);
    }

    @Override
    public String method(int a) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a ;i++) {
            char tmp = (char) ('а' + r.nextInt('я' - 'а'));
            sb.append(tmp);
        }
        System.out.println(sb.toString());


        if ((Math.sqrt(a) * Math.sqrt(a)) == a){
            System.out.println("квадрат");
        }
        return null;
    }
}

