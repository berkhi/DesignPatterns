package com.berkhayta._01_Factory._04_DatabaseFactory;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen loglama yapılacak db adını giriniz.(mongo/postgre)");
        String databaseType=scanner.nextLine().toLowerCase();

        ILogger logger=DatabaseFactory.createDatabase(databaseType);
        logger.log();
    }
}
