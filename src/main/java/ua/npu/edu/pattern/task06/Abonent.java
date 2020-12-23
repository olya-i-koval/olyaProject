package ua.npu.edu.pattern.task06;

public class Abonent implements Observer {
    String name;

    public Abonent(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " recieved magazine");
    }

}
