package com.berkhayta._00_Singleton._01_EagerOrnek;

public class ArabaEagerRunner {
    public static void main(String[] args) {
        ArabaEager arabaEager1=ArabaEager.getInstance();
        ArabaEager arabaEager2=ArabaEager.getInstance();
        ArabaEager arabaEager3=ArabaEager.getInstance();

        System.out.println(arabaEager1);
        System.out.println(arabaEager2);
        System.out.println(arabaEager3);

    }
}
