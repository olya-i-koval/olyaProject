package ua.edu.npu.lab01.task0110;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public int getDotNumber() {
        int dotNumber = 0;
        System.out.println("Enter number of dots: ");
        dotNumber = input.nextInt();
        return dotNumber;
    }

    int dots = getDotNumber();

    int[] x = new int[dots];
    int[] y = new int[dots];

    public void getCoordinates() {
        for(int i=0; i<dots; i++) {
            System.out.println("Enter x of " + i + " dot: ");
            x[i] = input.nextInt();
            System.out.println("Enter y of " + i + " dot: ");
            y[i] = input.nextInt();
        }
    }
}
