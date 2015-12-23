package ua.freesbe.training.patterns.singleton;

/**
 * + Lazy initialization
 *
 * - Thread unsafe
 */
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
