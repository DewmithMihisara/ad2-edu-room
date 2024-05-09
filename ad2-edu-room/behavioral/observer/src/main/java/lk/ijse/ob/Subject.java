package lk.ijse.ob;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class Subject {
    private final List<Observer> observers= new ArrayList<>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
