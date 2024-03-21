package com.berkhayta._01_Factory._05_PizzaFactory;

public class KlasikPizza extends Pizza {
    public KlasikPizza(EHamurTipi hamurTipi, EBoyut boyut, ETur tur) {
        super(hamurTipi, boyut, tur);
        System.out.println("Yapılan: Klasik Pizza "+ tur +" "+ boyut +" "+ hamurTipi);
    }

}
