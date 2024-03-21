package com.berkhayta._00_Singleton._01_LazyOrnek;
/*
LAZY SINGLETON ADIM ADIM:
1. adım: Constructor'ı private yap.
2. adım: static şekilde geriye Araba dönen getInstance metodunu yaz.
3. adım: static bir Araba field'i oluştur.
4. adım: eğer bu field null ise new ile yeni nesne oluştur ve field'da adresi tut.
 */
public class Araba {
    String marka;
    /*
    private:Dışarıdan erişilmesini kapattık
    static: Adresi değişmeyen ve sınıfa bağlı bir field olduğunu belirttik.
    null: İlk değeri null olan.
    geri dönüş tipi Araba olan instance adında bir field oluşturduk:
     */
    private static Araba INSTANCE=null; // yazmasak da değeri null'dır.
    private Araba(String marka) {
        this.marka=marka;
        System.out.println(marka+" markalı araba nesnesi oluşturuldu.");
    }
    /**
     * static keywordü ile işaretlenen bileşenlerin tümü uygulama ayağa kalkarken adreslenirler.
     * Bu sayede hepsi sınıfa bağlı olurlar.
     * Nesne yaratılmadan kullanılabilirler.
     * @return
     */
    public static Araba getInstance(String marka){
        //Eğer INSTANCE null ise new Araba() ile yeni Araba nesnesi üretecek.
        if(INSTANCE==null) {
            INSTANCE = new Araba(marka);
        }
        return INSTANCE;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
