package ua.freesbe.training.patterns.singleton;

public class EagerInitSingleton {

    public static EagerInitSingleton getInstance() {
        return instance;
    }

    private static EagerInitSingleton instance = new EagerInitSingleton();
    private EagerInitSingleton(){}
}
