package com.berkhayta._01_Factory._00_Nakliye;

public class Kamyon extends Tasima {
    public Kamyon() {
        super(TasimaTip.KARA);
        tasi();
    }

    public void tasi(){
        System.out.println("Kamyon taşıma işlemini yaptı.");
    }
}
