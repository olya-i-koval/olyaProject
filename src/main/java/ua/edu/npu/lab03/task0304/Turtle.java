package ua.edu.npu.lab03.task0304;

public class Turtle implements Swimming, Walking {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.swimm();
        turtle.walking();
    }
    @Override
    public void swimm() {
        System.out.println("I'm swimming");
    }

    @Override
    public void walking() {
        System.out.println("I go");
    }
}
