package ua.freesbe.training.patterns.singleton;

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
