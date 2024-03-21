package com.berkhayta._00_Singleton._06_SesSistemi;

public enum SesSistemi {
    INSTANCE;

    private int volume;

    SesSistemi() {
        volume=50;
    }
    
    public void setVolume(int volume) {
        if(volume>100 || volume<0){
            System.out.println("Hatalı ses seviyesi");
        }
        else{
            this.volume=volume;
            displayVolume();
        }
    }

    private void displayVolume() {
        System.out.println("Ses seviyesi:"+this.volume);
    }

}
