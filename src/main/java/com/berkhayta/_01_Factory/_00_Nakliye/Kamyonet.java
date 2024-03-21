package com.berkhayta._01_Factory._00_Nakliye;

public class Kamyonet extends Tasima{
    public Kamyonet() {
        super(TasimaTip.KARA);
        tasi();
    }

    @Override
    void tasi() {
        System.out.println("Kamyonet Taşıma işlemini yaptı.");
    }
}
