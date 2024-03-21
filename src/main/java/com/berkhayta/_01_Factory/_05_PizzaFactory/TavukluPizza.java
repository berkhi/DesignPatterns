package com.berkhayta._01_Factory._05_PizzaFactory;

public class TavukluPizza extends Pizza{
    public TavukluPizza(EHamurTipi hamurTipi, EBoyut boyut, ETur tur) {
        super(hamurTipi, boyut, tur);
        System.out.println("Yapılan: Tavuklu Pizza "+ tur +" "+ boyut +" "+ hamurTipi);
    }
}
