package ua.npu.edu.pattern.task06;

public class Post implements Observable {

    List<Observer> subscribers = new ArrayList<>();

    public void recieveMagazines () {
        notifyObservers();
    }

    @Override
    public void register(Observer obj) {
        this.subscribers.add(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers) {
            observer.update();
        }
    }
}
