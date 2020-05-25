package ua.edu.npu.lab06.task0601;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main implements MyInterface{

    public static void main(String[] args) {
        Main main = new Main();
        main.method();
    }

    @Override
    public String method() {
        System.out.println("Коваль Оля");

        GregorianCalendar calendar = new GregorianCalendar();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                System.out.println("понеділок");
                break;
            case 2:
            System.out.println("вівторок");
                break;
            case 3:
                System.out.println("середа");
                break;
            case 4:
                System.out.println("четвер");
                break;
            case 5:
                System.out.println("п'ятниця");
                break;
            case 6:
                System.out.println("субота");
                break;
            case 7:
                System.out.println("неділя");
                break;
        }

        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder();
        double a = Math.random()*10;
        for (int i = 0; i < a ;i++) { // For each letter in the word
            char tmp = (char) ('а' + r.nextInt('я' - 'а')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        System.out.println(sb.toString());


        return null;
    }

}
