package com.berkhayta._01_Factory._05_PizzaFactory;

public class VejeteryanPizza extends Pizza{
    public VejeteryanPizza(EHamurTipi hamurTipi, EBoyut boyut, ETur tur) {
        super(hamurTipi, boyut, tur);
        System.out.println("Yapılan: Vejeteryan Pizza "+ tur +" "+ boyut +" "+ hamurTipi);
    }
}
