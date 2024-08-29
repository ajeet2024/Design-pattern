package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void attach(Observer observer1) {
        observers.add(observer1);
    }

    @Override
    public void detach(Observer observer1) {
        observers.remove(observer1);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(state);
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
