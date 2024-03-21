package com.berkhayta._00_Singleton._04_RobotEnum;


public class Runner {
    public static void main(String[] args) throws InterruptedException {
       EvHalki evHalki1=new EvHalki();
       EvHalki evHalki2=new EvHalki();
       EvHalki evHalki3=new EvHalki();
//        evHalki1.robotCagir();
//        evHalki2.robotCagir();
//        evHalki3.robotCagir();
        evHalki1.start();
        evHalki2.start();
        evHalki3.start();

    }


}
