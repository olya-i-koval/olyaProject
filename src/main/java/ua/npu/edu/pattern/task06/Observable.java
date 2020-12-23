package ua.npu.edu.pattern.task06;

public interface Observable {
    void register(Observer obj);
    void notifyObservers();
}
