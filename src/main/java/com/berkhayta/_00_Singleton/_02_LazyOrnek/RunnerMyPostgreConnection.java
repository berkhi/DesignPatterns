package com.berkhayta._00_Singleton._02_LazyOrnek;

public class RunnerMyPostgreConnection {
    public static void main(String[] args) {
        MyPostgreConnection myConnection1 = MyPostgreConnection.getInstance();
        MyPostgreConnection myConnection2 = MyPostgreConnection.getInstance();
        MyPostgreConnection myConnection3 = MyPostgreConnection.getInstance();
        System.out.println(myConnection1);
        System.out.println(myConnection2);
        System.out.println(myConnection3);

        System.out.println(myConnection1.equals(myConnection2));
    }
}
