package ua.edu.npu.lab01.task0104;

import java.util.Scanner;

public class replacement {
    public static void main (String[] agrs) {
        Scanner reader = new Scanner(System.in);
        String[] array = "Каждый охотник желает знать, где сидит фазан".split(" ");
        String symbol = "$";
        int k = reader.nextInt();;

        for (int i = 0; i < array.length; i++) {
            if ( array[i].length() >= k) {
                array[i] = array[i].substring(0, k-1) +symbol + array[i].substring(k);
            }
        }
        System.out.println(String.join(" ",array));
    }

}
