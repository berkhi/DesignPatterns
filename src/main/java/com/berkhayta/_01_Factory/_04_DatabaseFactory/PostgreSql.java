package com.berkhayta._01_Factory._04_DatabaseFactory;

public class PostgreSql implements ILogger {
    @Override
    public void log() {
        System.out.println("Logging to PostgreSql...");
    }
}
