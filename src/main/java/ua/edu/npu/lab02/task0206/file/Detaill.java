package ua.edu.npu.lab02.task0206.file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class Detaill {
    public Scanner reader = new Scanner(System.in);
    int i =5;
    public String name;
    public String trademark;
    public String countryproducer;
    public String dateproduction;

    public int uptime;
    public String note;


    public void typeDetail() {
        name = "name";
        trademark = "trademark";
        countryproducer = "country producer";
        dateproduction = "date production";
        uptime = 0;
        note = "note";

    }

    public void accessToData() {
        System.out.println("enter name: ");
        name = reader.nextLine();
        System.out.println("enter trademark: ");
        trademark = reader.nextLine();
        System.out.println("enter data production: ");
        dateproduction = reader.next();
        System.out.println("enter count production: ");
        countryproducer= reader.next();
        System.out.println("enter uptime: ");
        uptime = reader.nextInt();
        System.out.println("enter note: ");
        note = reader.nextLine();
        System.out.println("name: " + name);
        System.out.println("trademark: " + trademark);
        System.out.println("data production: " + dateproduction);
        System.out.println("uptime: " + uptime);
        System.out.println("country producer" + countryproducer);
        System.out.println("note: " + note);
    }


    public int toData(int day, int month, int year) {
        if (day > 31 || day < 0 || month < 0 || month > 12) {
            System.out.println("incorrect current date");
            return 0;
        }

        int day1 = 15;
        int monht1 = 04;
        int year1 = 2020;
        int d, m, y;
        d = day - day1;
        m = month - monht1;
        y = year - year1;
        if (d < 0) {
            d = day + 30 - day1;
            m -= 1;
        }
        if (m < 0) {
            m = month + 12 - monht1;
            y -= 1;
        }
     System.out.println("time has passed since writing the program: " + d + " day " + m + "  month " + y + " year");
return 0;

    }
}