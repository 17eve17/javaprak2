package ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logToConsole(String message) {
        System.out.println(message);
    }

    public void logToFile(String message, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            writer.println(message);
        } catch (IOException e) {
            System.out.println("Помилка при запису в файл: " + e.getMessage());
        }
    }
}

