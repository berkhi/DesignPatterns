package com.berkhayta._00_Singleton._03_RobotOrnek;

public class RobotEager {
    private static RobotEager INSTANCE=new RobotEager();

    private RobotEager() {
    }

    public static RobotEager getInstance(){
        return INSTANCE;
    }
    public String calis(){
        return this.hashCode()+" numaralı robot çalıştı";
    }

}
