package com.berkhayta._00_Singleton._01_EagerOrnek;

/*
Eager:  Aceleci

Lazy:   Yavaş
 */
public class ArabaEager {

    /**
     * static olarak oluşturduğunuz fieldlar bir kere adreslenirdi.
     * içindeki değer sabitlendi.Bir daha çalışmaz.
     */
    private static ArabaEager INSTANCE =new ArabaEager();

    private ArabaEager() {
    }

    public static ArabaEager getInstance() {
        return INSTANCE;
    }


}
