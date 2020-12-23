package ua.npu.edu.pattern.task07;

public class DeveloperGrant {
    public static void main(String[] args) {
        State state = new Confirmed();
        Developer developer = new Developer();

        developer.setState(state);

        for (int i = 0; i < 10; i++) {
            developer.stateGrant();
            developer.changeState();

        }
    }

}
