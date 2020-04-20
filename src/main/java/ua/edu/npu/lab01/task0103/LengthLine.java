package lab103;

import java.util.Scanner;

public class LengthLine {
    public static void main(String[] agrs) {
        int s = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("кількість рядочків");
        int n = reader.nextInt();
        String[] myLine = new String[n];
        for (int i = 0; i < n; i++) {
            String str = reader.next();
            myLine[i] = str;
        }
        for (int i = 0; i < n; i++) {

            s += myLine[i].length();

        }
        for (int i = 0; i < n; i++) {
            if ((s / myLine.length) > myLine[i].length()) {
                System.out.println("рядок довжиною менше за заг. сер.довжину ");
                System.out.println(myLine[i]);

            }
        }

    }
}