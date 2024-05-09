package lk.ijse;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-09
 * @since 0.0.1
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
