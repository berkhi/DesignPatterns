package com.berkhayta._01_Factory._00_Nakliye;

public class TasimaFactory {
    //bir metod gerekli. tip almalı, geriye de uygun nesneyi dönmeli.
    public static Tasima builder(TasimaTip tip){
//        switch (tip){
//            case KARA:
//               return new Kamyon();
//            case DENIZ:
//                return new Gemi();
//            case HAVA:
//                return new Ucak();
//            default:
//                throw new IllegalArgumentException("Uygun olmayan taşıma tipi!");
//        }
        return switch (tip) {
            case KARA -> new Kamyonet();
            case DENIZ -> new Gemi();
            case HAVA -> new Ucak();
        };
    }
}
