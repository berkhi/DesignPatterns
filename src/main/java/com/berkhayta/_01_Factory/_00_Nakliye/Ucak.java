package com.berkhayta._01_Factory._00_Nakliye;

public class Ucak extends  Tasima {
    public Ucak() {
        super(TasimaTip.HAVA);
        tasi();
    }

    public void tasi(){
        System.out.println("Ucak taşıma işlemini yaptı.");
    }
}
