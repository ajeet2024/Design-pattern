package observer;

public class Test {

    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();

        ConcreateObserver observer1 = new ConcreateObserver("Observer 1");
        ConcreateObserver observer2 = new ConcreateObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State 1"); // Both observers will receive this update

        subject.detach(observer1); // Detach observer1

        subject.setState("State 2"); // Only observer2 will receive this update
    }
}
