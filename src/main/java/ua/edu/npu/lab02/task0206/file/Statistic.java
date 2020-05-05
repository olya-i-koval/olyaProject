package ua.edu.npu.lab02.task0206.file;

import java.util.Scanner;

public class Statistic {

    int a = 9;
    int[] data = new int[a];

    public void reedArray() {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the amount of data");
        a = reader.nextInt();
        for (int i = 0; i < data.length; i++) {
            data[i] = reader.nextInt();
        }
    }
    public int addingResult() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        System.out.println("adding a result:" + sum);
        return sum;

    }

    public void maxAndMinElement() {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("maximum element: " + max);
        System.out.println("minimum element: " + min);
    }
    double f;
    public void averageValue() {
        int sum2 =0;

        for ( int i = 0; i < data.length; i++) {
            sum2 += data[i];
        }
        f = sum2 / data.length;
        System.out.println("average value: " + f);
    }
    public void modaResult() {

        int[] data2 = new int[data.length];
        for (int i = 0; i <= data.length - 1; i++) {
            for (int j = 0; j <= data.length - 1; j++) {
                if (data[i] == data[j])
                    data2[i]++;
            }
        }
        int p = 0;
        for (int i = 0; i < data.length; i++) {
            if (data2[i] > p)
                p = data2[i];
        }
        System.out.println(("moda elements: " + data2[p]));
    }
    public void median() {
        //int data2[] = data;
        //int min2 = data[0];
        //int t;
        for(int i = data.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
        int i = data.length/2;
        if (data.length%2 ==0)
            System.out.println("median:" + data[i] + ", " + data[--i]);
        else
            System.out.println("median: " + data[i]);
    }
    public void lassAverage() {
        int pm =0;
        int pb=0;
        for (int i = 0; i<data.length; i++) {
            if (f > data[i]) {
                pm++;
            }
            else
                pb++;
        }
        System.out.println("lass average: " + pm);
        System.out.println("more average: " + pb);
    }

    public static void main(String[] args) {
        Statistic s = new Statistic();

        s.reedArray();
        s.addingResult();
        s.maxAndMinElement();
        s.averageValue();
        s.modaResult();
        s.median();
        s.lassAverage();
    }
}
