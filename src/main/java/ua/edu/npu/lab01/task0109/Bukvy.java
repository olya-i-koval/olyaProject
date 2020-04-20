package ua.edu.npu.lab01.task0109;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bukvy {
    public static void main(String[] agrs) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        int g = 0, p = 0;

        for (char element : text.toCharArray()) {
            if (element != 'a' & element != 'e' & element != 'y' & element != 'u' & element != 'i' & element != 'o')
                p++;
            else {
                g++;
            }
        }
            if (g > p)
                System.out.println("more vowel letters: " + g);
            else
                System.out.println("more consonant letters: " + p);

        }
    }
