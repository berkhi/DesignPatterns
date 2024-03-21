package com.berkhayta._01_Factory._00_Nakliye;

public abstract class Tasima {
    private TasimaTip tip;

    public Tasima(TasimaTip tip) {
        this.tip = tip;
    }

    abstract void tasi();
    // abstract: bu metodun miras alan sınıflarda override edilmesini zorlar.


}
