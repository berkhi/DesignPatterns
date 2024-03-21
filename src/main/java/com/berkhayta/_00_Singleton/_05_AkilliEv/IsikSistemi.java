package com.berkhayta._00_Singleton._05_AkilliEv;

public class IsikSistemi {
    private static IsikSistemi INSTANCE = null;
    private boolean isikDurumu=false;

    public boolean isIsikDurumu() {
        return isikDurumu;
    }


    private IsikSistemi() {
    }
    public static IsikSistemi getInstance() {
        if(INSTANCE==null){
            INSTANCE = new IsikSistemi();
        }
        return INSTANCE;
    }
    public void isiklariAc(){
        isikDurumu=true;
        durumGoster();
    }
    public void isiklariKapat(){
        isikDurumu=false;
        durumGoster();
    }
    public void durumGoster(){
        if(isikDurumu){
            System.out.println("Işıklar Açık");
        }else{
            System.out.println("Işıklar Kapalı");
        }
    }





}
