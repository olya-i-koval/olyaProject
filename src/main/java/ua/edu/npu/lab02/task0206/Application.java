package ua.edu.npu.lab02.task0206;

import ua.edu.npu.lab02.task0206.file.Detaill;
import ua.edu.npu.lab02.task0206.file.Dog;
import ua.edu.npu.lab02.task0206.file.Statistic;

public class Application {

    public static void main(String[] args) {
        System.out.println(" class Detaill: ");
        Detaill detaill = new Detaill();
        detaill.accessToData();
        detaill.toData(05,05,2020);


        System.out.println(" class Statistic: ");
        Statistic statistic = new Statistic();
        statistic.reedArray();
        statistic.addingResult();
        statistic.maxAndMinElement();
        statistic.averageValue();
        statistic.modaResult();
        statistic.median();
        statistic.lassAverage();

        System.out.println(" class Dog: ");
        Dog dog = new Dog();
        Dog dog1 = new Dog(12, "Антон");

    }
}
