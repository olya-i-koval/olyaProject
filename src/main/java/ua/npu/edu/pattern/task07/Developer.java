package ua.npu.edu.pattern.task07;

public class Developer {
    State state;
    public void setState(State state){
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Confirmed) {
            setState(new Confirmed());
        } else if (state instanceof Created) {
            setState(new Created());
        } else if (state instanceof Postponed) {
            setState(new Postponed());
        }
    }

    public void stateGrant() {
        state.stateGrant();
    }
}
