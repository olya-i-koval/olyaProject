package ua.edu.npu.lab03.task0304;

public class Fish implements Swimming{
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swimm();
    }
    @Override
    public void swimm() {
        System.out.println("I'm swimming");
    }
}
