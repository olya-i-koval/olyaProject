package ua.edu.npu.lab01.task0101;

import java.util.Scanner;

public class App {
    public static void main (String[] agrs) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = reader.nextInt();
        String[] myLine = new String[n];
        for ( int i = 0; i < n; i++) {
            String str = reader.nextLine();
            myLine[i] = str;
        }

        int min = myLine[0].length();

        for (int i = 1; i < n; i++) {
            if (myLine[i].length() < min)
                min = myLine[i].length();
        }

        for (int i = 0; i < n; i++) {
            if (myLine[i].length() == min )
                System.out.print("the shortest line: ");
            System.out.print(myLine[i]);
        }

    }
}


