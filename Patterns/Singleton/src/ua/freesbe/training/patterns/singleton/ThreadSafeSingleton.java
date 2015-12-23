package ua.freesbe.training.patterns.singleton;

public class ThreadSafeSingleton {

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}
}
