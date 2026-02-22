package problem01;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance = null;
    private ELogLevel logLevel = null;
    private static int logLinesQuantity = 0;

    private Logger() {
        try (FileWriter fileWriter = new FileWriter("log.txt")) {
            fileWriter.write("");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    };

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogLevel(ELogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void log(String message, ELogLevel logLevel) {
        if (this.logLevel != null && (this.logLevel.ordinal() > logLevel.ordinal())) return;
        try (FileWriter fileWriter = new FileWriter( "log.txt", true)) {
            fileWriter.write((Logger.logLinesQuantity > 0 ? "\n" : "") + "[" + logLevel + "]: " + message);
            Logger.logLinesQuantity++;
        } catch (IOException e) {
            System.out.println("Error occurred while trying to write log to 'log.txt': " + e.getMessage());
        }
    }
}