package week1.singletonProjectEg;
public class test {
    public static void main(String[] args) {
        Logon logger1 = Logon.getInstance();
        Logon logger2 = Logon.getInstance();
        logger1.log("Hi this is test log 1.");
        logger2.log("Hi this is test log 2.");
        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Loggers are different instances.");
        }
    }
    
}
 