package ua.freesbe.training.patterns.singleton;

/**
 *  + Lazy initialization
 *  + Thread safe
 *  + Very high performance
 *
 *  - Impossible to use for non static class fields
 */
public class SingletonHolder {

    public static SingletonHelper getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final SingletonHelper INSTANCE = new SingletonHelper();
    }
}
