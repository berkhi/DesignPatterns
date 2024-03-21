package com.berkhayta._01_Factory._04_DatabaseFactory;

public class DatabaseFactory {
    public static ILogger createDatabase(String databaseType){

        switch (databaseType){
            case "mongo":
              return  new MongoDb();
            case "postgre":
                return  new PostgreSql();
            default:
                throw new IllegalArgumentException("Unknown database type: " + databaseType);
        }

    }
}
