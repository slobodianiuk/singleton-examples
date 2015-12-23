package ua.freesbe.training.patterns.singleton;

/**
 * + Lazy initialization
 * + High performance
 *
 * - JDK 1.5+ required
 */
public class DoubleCheckThreadSafeSingleton {

    public DoubleCheckThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    private volatile DoubleCheckThreadSafeSingleton instance;
    private DoubleCheckThreadSafeSingleton() {}
}
