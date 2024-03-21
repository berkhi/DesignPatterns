package com.berkhayta._01_Factory._00_Nakliye;

public class RunnerNakliye {
    public static void main(String[] args) {
//        Kamyon kamyon1=new Kamyon();
//        kamyon1.tasi();
//
//        Gemi gemi1=new Gemi();
//        gemi1.tasi();
//
//        Ucak ucak1=new Ucak();
//        ucak1.tasi();

        Tasima tasima=TasimaFactory.builder(TasimaTip.KARA);
        tasima=TasimaFactory.builder(TasimaTip.HAVA);
        tasima=TasimaFactory.builder(TasimaTip.DENIZ);



    }
}
