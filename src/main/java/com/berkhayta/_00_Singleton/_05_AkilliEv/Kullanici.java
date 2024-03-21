package com.berkhayta._00_Singleton._05_AkilliEv;

public class Kullanici {
    public void isiklarinDurumunuDegistir(){
        IsikSistemi instance = IsikSistemi.getInstance();
        if(instance.isIsikDurumu()){
            instance.isiklariKapat();
        }else{
            instance.isiklariAc();

        }

    }
}
