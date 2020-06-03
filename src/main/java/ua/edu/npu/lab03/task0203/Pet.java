package ua.edu.npu.lab03.task0203;

public abstract class Pet {
    String name;
    int age;
    Pet(){
        name = "unknown";
        age = 0;
    }
    public Pet(String n, int a) {
        name = n;
        age = a;
    }
}
