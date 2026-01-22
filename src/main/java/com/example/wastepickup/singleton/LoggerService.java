
package com.example.wastepickup.singleton;

public class LoggerService {
    private static LoggerService instance;

    private LoggerService() {
        // private constructor to prevent instantiation
    }

    public static synchronized LoggerService getInstance() {
        if (instance == null) {
            instance = new LoggerService();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
