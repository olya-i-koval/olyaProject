package ua.edu.npu.lab03.task0304;

public class Duck extends Pet implements Flying, Swimming, Talking,Walking {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swimm();
        duck.talk();
        duck.walking();
    }
    @Override
    public void fly() {
        System.out.println("I fly");
    }

    @Override
    public void swimm() {
        System.out.println("I'm swimming");
    }

    @Override
    public void talk() {
        System.out.println("quack-quack");
    }

    @Override
    public void walking() {
        System.out.println("i go");
    }
}
