package ua.freesbe.training.patterns.singleton;

public class SingletonHolder {

    public static SingletonHelper getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final SingletonHelper INSTANCE = new SingletonHelper();
    }
}
