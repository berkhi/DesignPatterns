package com.berkhayta._01_Factory._00_Nakliye;

public class Gemi extends Tasima  {

    public Gemi() {
        super(TasimaTip.DENIZ);
        tasi();
    }

    @Override
    public void tasi(){
        System.out.println("Gemi taşıma işlemini yaptı.");
    }
}
