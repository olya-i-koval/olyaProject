package ua.npu.edu.pattern.task05;

public class App {
    public static void main(String[] args) {
        Character vampire = new Character();
        Character elf = new Character();
        Character pegasus = new Character();

        elf.setAction(new Elf());
        vampire.setAction(new Vampire());
        pegasus.setAction(new Pegasus());


        vampire.doActing();
        elf.doActing();
        pegasus.doActing();
    }
}
