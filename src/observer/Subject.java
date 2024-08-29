package observer;

public interface Subject {
    void attach(Observer observer1);
    void detach(Observer observer1);
    void notifyObservers();
}
