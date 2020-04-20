package ua.edu.npu.lab01.task0102;

import java.util.Scanner;

public class Ordering {
    public static void main(String[] agrs) {
        int t;
        Scanner reader = new Scanner(System.in);
        System.out.println("кількість рядочків");
        int n = reader.nextInt();
        String[] myLine = new String[n];
        for (int i = 0; i < n; i++) {
            String str = reader.nextLine();
            myLine[i] = str;
        }

        for (int i = 0; i < myLine.length; i++) {
            int min = myLine[i].length();
            int min_i = i;
            for (int j = i + 1; j < myLine.length; j++) {
                if (myLine[j].length() < min) {
                    min = myLine[j].length();
                    min_i = j;
                }
            }
            if (i != min_i) {
                String tmp = myLine[i];
                myLine[i] = myLine[min_i];
                myLine[min_i] = tmp;


            }
        }
        for (int i = 0; i < myLine.length; i++)
            System.out.println(myLine[i]);
    }
}

