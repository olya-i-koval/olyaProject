package ua.edu.npu.lab03.task0303;

public class Pet {
    String name;
    int age;
    Pet(){
        name = "unknown";
        age = 0;
        System.out.println(name + "  " + age);
    }
    public Pet(String n, int a) {
        name = n;
        age = a;
        System.out.println(name + "  " + age);
    }
}
