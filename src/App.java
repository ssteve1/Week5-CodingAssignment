public class App {
    public static void main(String[] args) {
        Logger logger = new AsteriskLogger();
        Logger spacedLog = new SpacedLogger();
        logger.log("Good Morning");
        System.out.println();
        logger.error("Hello there!");
        System.out.println();
        spacedLog.log("Computer science is fun");
        System.out.println();
        spacedLog.error("Hello");
    }
}