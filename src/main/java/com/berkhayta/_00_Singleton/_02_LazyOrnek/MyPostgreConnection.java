package com.berkhayta._00_Singleton._02_LazyOrnek;
/*
Lazy Singleton:
 */
public class MyPostgreConnection {

    private static MyPostgreConnection INSTANCE;

    private MyPostgreConnection() {
    }

    public static MyPostgreConnection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MyPostgreConnection();
        }
        return INSTANCE;
    }
    public String toString() {
        return "hashcode=>"+hashCode();
    }

}
