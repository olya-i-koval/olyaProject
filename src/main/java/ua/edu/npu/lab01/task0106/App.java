package ua.edu.npu.lab01.task0106;

import java.util.Scanner;

public class App {
    public static void main (String... av) {
        Scanner reader = new Scanner(System.in);

        System.out.println("ваш текст");
        String s = reader.nextLine();
        System.out.println("End "+delNoDigOrLet(s));
    }

    private static String delNoDigOrLet (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character .isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        int i=0;
        for ( i=1; i <= sb.length(); i++) {
            sb.insert(i++," ");
        }
        return sb.toString();
    }
}

