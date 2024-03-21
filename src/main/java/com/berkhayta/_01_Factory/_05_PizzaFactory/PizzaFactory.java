package com.berkhayta._01_Factory._05_PizzaFactory;

import java.util.Scanner;

public class PizzaFactory {
    static Scanner scanner=new Scanner(System.in);
    public static Pizza madePizza(){

        ETur tur=enumPrinter("Pizza Türünü Seçiniz:",ETur.values());
        EBoyut boyut=enumPrinter("Pizza Boyutunu Seçiniz:",EBoyut.values());
        EHamurTipi hamurTipi=enumPrinter("Pizza Hamur Tipini Seçiniz:",EHamurTipi.values());

        return getPizza(tur, boyut, hamurTipi);

    }

    private static Pizza getPizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
       return switch (tur){
            case AKDENIZ -> new VejeteryanPizza(hamurTipi, boyut, tur);
           case KARISIK, TONBALIKLI -> new KlasikPizza(hamurTipi, boyut, tur);
           case TAVUKLU, BARBEKUTAVUKLU -> new TavukluPizza(hamurTipi, boyut, tur);
       };
    }

    //Generic bir metod yazımı:
    public static <E extends Enum<E>> E enumPrinter(String mesaj, E[] values){
        System.out.println(mesaj);
        for(E enumValue : values){
            System.out.println( enumValue.ordinal() +" "+enumValue);
        }
        int secim= scanner.nextInt();
        return values[secim];
    }
}
