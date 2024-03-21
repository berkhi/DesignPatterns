package com.berkhayta._00_Singleton._04_RobotEnum;

import com.berkhayta._00_Singleton._03_RobotOrnek.RobotEager;
import com.berkhayta._00_Singleton._03_RobotOrnek.RobotLazy;

public class EvHalki extends Thread {
    public void robotCagir(){ //lazy
        RobotLazy robotInstance = RobotLazy.getInstance();
        System.out.println(robotInstance.calis());
    }

    public void robotCagirEager(){ //eager
        RobotEager robotInstance = RobotEager.getInstance();
        System.out.println(robotInstance.calis());
    }

    public void robotCagirEnum(){
        System.out.println(Robot.ROBOT.calis());
    }

    @Override
    public void run() {
      // robotCagir();
      //  robotCagirEager();
        robotCagirEnum();
    }
}
