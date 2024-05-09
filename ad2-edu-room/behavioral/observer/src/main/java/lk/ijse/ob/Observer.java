package lk.ijse.ob;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
