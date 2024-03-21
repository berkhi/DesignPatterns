package com.berkhayta._00_Singleton._06_SesSistemi;

public class Kullanici {
    public void sesKontrol(int sesSeviyesi){
        SesSistemi.INSTANCE.setVolume(sesSeviyesi);
    }
}
