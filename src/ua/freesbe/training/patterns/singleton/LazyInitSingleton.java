package ua.freesbe.training.patterns.singleton;

public class LazyInitSingleton {

    public LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }

        return instance;
    }

    private static LazyInitSingleton instance;
    private LazyInitSingleton() {}
}
