package com.berkhayta._01_Factory._05_PizzaFactory;

public abstract class Pizza {
    private EHamurTipi hamurTipi;
    private EBoyut boyut;
    private ETur tur;

    public Pizza(EHamurTipi hamurTipi, EBoyut boyut, ETur tur) {
        this.hamurTipi = hamurTipi;
        this.boyut = boyut;
        this.tur = tur;
    }
}
