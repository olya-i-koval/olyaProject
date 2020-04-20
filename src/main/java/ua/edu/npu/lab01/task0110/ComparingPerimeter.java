package ua.edu.npu.lab01.task0110;

import java.lang.Math;

public class ComparingPerimeter extends Input {
    double Perimeter = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    public void getBiggerPerimeter() {
        for(int i=0; i<dots; i++) {
            for(int j=i+1; j<dots; j++) {
                for(int k=j+1; k<dots; k++){
                    a = getLength(x[i], x[j], y[i], y[j]);
                    b = getLength(x[i], x[k], y[i], y[k]);
                    c = getLength(x[j], x[k], y[j], y[k]);
                    a *= 10;
                    a = Math.round(a);
                    a /= 10;
                    b *= 10;
                    b = Math.round(b);
                    b /= 10;
                    c *= 10;
                    c = Math.round(c);
                    c /= 10;
                    if((a+b+c) > Perimeter) {
                        Perimeter = a + b + c;
                    }
                }
            }
        }
    }

    public double getLength(int x1, int x2, int y1, int y2){
        double lengthPow = 0;
        double side;
        lengthPow = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        side = Math.sqrt(lengthPow);
        return side;
    }

    public void Output() {
        System.out.println("The biggest perimeter is " + a + "+" + b + "+" + c + "=" + Perimeter);
    }
}
