package ua.edu.npu.lab01.task0107;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();

        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();

        System.out.println("введіть букву першу букву");
        String first = reader.next();
        char f = first.charAt(0);
        System.out.println("довжина");
        int leng = reader.nextInt();

        for (int i = 0; i<strArr.length ; i++) {
            if(!(strArr[i].length()==leng) && !(f==strArr[i].charAt(0))) {
                sb.append(strArr[i]).append(" ");
            }
        }

        String outText = sb.toString().trim();

            System.out.println(outText);
    }
}
