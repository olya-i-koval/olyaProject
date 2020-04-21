package ua.edu.npu.lab01.task0105;

import java.util.Scanner;

public class Codirovka {
    public static void main(String[] args) {
        try {
           // char[] text = new char[] {' ','J',' ','A',' ','V',' ','A'};
            char[] text = new char[] {' ','J',' ','A',' ','V',' ','A',' ',' ',' ', '-',' ',' ', 'g',' ','o',' ','o',' ','d',' ',' ' ,'l',' ','a',' ','n',' ','g',' ','u',' ','a',' ','g',' ','e'};
            //char[] testChars = new char[] {'a','b','c','d','e','f','g',' ','1','2','3','4','5','6','7'};
            String str = new String(text);

            byte[] bytes = str.getBytes("ascii");
            System.out.println(text);
            for ( int i = 0; i < text.length; i++ )
                System.out.print( bytes[i] );

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

    }
}
