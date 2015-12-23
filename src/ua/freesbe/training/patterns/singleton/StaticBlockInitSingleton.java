package ua.freesbe.training.patterns.singleton;

/**
 *  + Lazy initialization
 *  + Possibility to handle exceptions during the creation of instance
 *
 *  - Thread unsafe
 */
public class StaticBlockInitSingleton {

    public static StaticBlockInitSingleton getInstance() {
        return instance;
    }

    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating of Singleton", e);
        }
    }

    private static StaticBlockInitSingleton instance;
    private StaticBlockInitSingleton() {
    }
}
