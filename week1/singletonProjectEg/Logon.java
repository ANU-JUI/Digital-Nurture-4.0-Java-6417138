package week1.singletonProjectEg;

public class Logon {
    private static Logon instance;

    private Logon() {
        // Private constructor to prevent instantiation
    }

    public static Logon getInstance() {
        if (instance == null) {
            instance = new Logon();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
