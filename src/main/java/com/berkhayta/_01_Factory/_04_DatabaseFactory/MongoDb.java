package com.berkhayta._01_Factory._04_DatabaseFactory;

public class MongoDb implements ILogger {
    @Override
    public void log() {
        System.out.println("Logging to MongoDb...");
    }
}
