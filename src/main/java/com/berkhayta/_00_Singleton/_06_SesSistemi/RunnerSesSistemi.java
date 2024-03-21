package com.berkhayta._00_Singleton._06_SesSistemi;

public class RunnerSesSistemi {
    public static void main(String[] args) {
        Kullanici kullanici1=new Kullanici();
        Kullanici kullanici2=new Kullanici();

        kullanici1.sesKontrol(120);
        kullanici2.sesKontrol(70);
        kullanici1.sesKontrol(20);
        kullanici2.sesKontrol(-50);
    }
}
