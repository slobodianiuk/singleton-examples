package ua.freesbe.training.patterns.singleton;

/**
 * + Simple realization
 * + Thread safe
 *
 * - Not lazy initialization
 */
public class EagerInitSingleton {

    public static Object getInstance() {
        return INSTANCE;
    }

    private static final Object INSTANCE = new Object();
    private EagerInitSingleton(){}
}
