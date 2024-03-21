package com.berkhayta._00_Singleton._05_AkilliEv;

public class RunnerIsikSistemi {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici();
        Kullanici kullanici2 = new Kullanici();

        kullanici1.isiklarinDurumunuDegistir();
        kullanici2.isiklarinDurumunuDegistir();
        kullanici2.isiklarinDurumunuDegistir();
        kullanici2.isiklarinDurumunuDegistir();
        kullanici2.isiklarinDurumunuDegistir();

    }
}
