package com.berkhayta._00_Singleton._04_RobotEnum;

public enum Robot {
    ROBOT;

    String name;

    public String calis(){
        return this.hashCode()+" numaralı robot çalıştı";
    }
}
