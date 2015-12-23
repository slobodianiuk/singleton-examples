package ua.freesbe.training.patterns.singleton;

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
