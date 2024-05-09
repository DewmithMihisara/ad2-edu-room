package lk.ijse;

import lk.ijse.ob.BinaryObserver;
import lk.ijse.ob.HexObserver;
import lk.ijse.ob.Subject;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since ${VERSION}
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}