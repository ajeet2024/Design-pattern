package observer;

public class ConcreateObserver implements Observer {
    private String observerName;

    public ConcreateObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + " received update: " + message);
    }
}
