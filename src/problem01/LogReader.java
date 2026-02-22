package problem01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {
    private static LogReader instance = null;

    private LogReader() {};

    public static LogReader getInstance() {
        if (instance == null) {
            instance = new LogReader();
        }
        return instance;
    }

    public void read(ELogLevel logLevel) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ELogLevel lineLogLevel = ELogLevel.valueOf(line.substring(1, line.lastIndexOf(']')));
                if (logLevel.ordinal() > lineLogLevel.ordinal()) continue;
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred while trying to read from 'log.txt': " + e.getMessage());
        }
    }
}
