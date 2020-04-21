package ua.edu.npu.lab01.task0111;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ArrayList<Point2D.Double> list = new ArrayList<Point2D.Double>();
        Scanner reader = new Scanner(System.in);

        Point2D.Double p = new Point2D.Double();

        System.out.print("Enter the number of points: ");
        int size = reader.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter x of " + i + " dot: ");
            p.x = reader.nextDouble();
            System.out.println("Enter y of " + i + " dot: ");
            p.y = reader.nextDouble();
            list.add(p);

        }
        int pos = 0;

        double minDist = Double.MAX_VALUE, d;
        for (int i = 0; i < size; i++) {
            d = 0;
            p = list.get(i);

            for (int j = 0; j < size; j++) {
                if (i != j) {
                    d = d + dist(p, list.get(j));
                }
            }

            if (d < minDist) {
                minDist = d;
                pos = i;
            }
        }
        System.out.print("Point with min distance: " + list.get(pos).x + "," + list.get(pos).y);
    }
    public static double dist(Point2D.Double p1, Point2D.Double p2) {
        double dist = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        return (dist);
    }

}


