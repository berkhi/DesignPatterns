package com.berkhayta._00_Singleton._03_RobotOrnek;

public class EvHalki extends Thread {
    public void robotCagir(){ //lazy
        RobotLazy robotInstance = RobotLazy.getInstance();
        System.out.println(robotInstance.calis());
    }

    public void robotCagirEager(){ //eager
        RobotEager robotInstance = RobotEager.getInstance();
        System.out.println(robotInstance.calis());
    }

    @Override
    public void run() {
      // robotCagir();
        robotCagirEager();
    }
}
