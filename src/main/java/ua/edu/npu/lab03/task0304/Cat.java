package ua.edu.npu.lab03.task0304;

public class Cat implements Talking, Walking {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.talk();
        cat.walking();
    }

    @Override
    public void talk() {
        System.out.println("meow-meow");
    }

    @Override
    public void walking() {
        System.out.println("i go");
    }
}
