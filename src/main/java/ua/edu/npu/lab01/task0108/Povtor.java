package ua.edu.npu.lab01.task0108;

import java.util.ArrayList;
import java.util.Scanner;

public class Povtor {

    public static void main(String[] agrs) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        int a = text.split(" ").length;
        String[] text2 = new String[a];
        int q = 0;
        for (String retval : text.split(" ")) {
            text2[q++] = retval;
        }
        ArrayList<String> CountingWords = new ArrayList<>();
        ArrayList<Integer> Counting = new ArrayList<>();

        int j = 0;
        int tempInd;
        int temp;
        while (j < text2.length) {
            if (CountingWords.contains(text2[j])) {
                tempInd = CountingWords.indexOf(text2[j]);
                temp = Counting.get(tempInd);
                Counting.set(tempInd, temp + 1);
            } else {
                CountingWords.add(text2[j]);
                Counting.add(1);
            }

            j++;
        }
            for (int i = 0; i < CountingWords.size(); i++) {
                System.out.println(CountingWords.get(i) + " = " + Counting.get(i));


            }

        }


    }







