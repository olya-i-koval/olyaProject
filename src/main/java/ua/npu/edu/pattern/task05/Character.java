package ua.npu.edu.pattern.task05;

public class Character {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }
    public void doActing() {
        action.acting();
    }
}
