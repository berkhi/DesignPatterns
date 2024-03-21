package com.berkhayta._00_Singleton._03_RobotOrnek;

//LAZY SINGLETON

public class RobotLazy {
    //Robot sınıfından türetilen nesneyi tutmak.
    private static RobotLazy INSTANCE;

    //Robot sınıfından dışarıdan nesne üretilmesini engelleyecek.
    private RobotLazy() {
    }

    //Robot nesnesinin bir kere üretilmesini sağlar.
    public static synchronized RobotLazy getInstance() {
        if(INSTANCE==null){
            INSTANCE=new RobotLazy();
        }
        return INSTANCE;
    }
    public String calis(){
        return this.hashCode()+" numaralı robot çalıştı";
    }
}
