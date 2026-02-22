package problem01;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        LogReader logReader = LogReader.getInstance();

        logger.setLogLevel(ELogLevel.WARNING);
        logger.log("Some info message", ELogLevel.INFO);
        logger.log("Some warning message", ELogLevel.WARNING);
        logger.log("Some error message", ELogLevel.ERROR);

        logReader.read(ELogLevel.ERROR);
    }
}
