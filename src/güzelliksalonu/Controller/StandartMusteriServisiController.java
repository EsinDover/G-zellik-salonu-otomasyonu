
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Musteri;

import güzelliksalonu.Service.StandartMusteriServisi;


public class StandartMusteriServisiController {
    
    StandartMusteriServisi standartMusteriServisi;

    public StandartMusteriServisiController(StandartMusteriServisi standartMusteriServisi) {
        this.standartMusteriServisi = standartMusteriServisi;
    }
    
    
    
    
    
    
    public Musteri getMusteri(String musteriId) {
        return standartMusteriServisi.getMusteri(musteriId);
    }


    public void yeniMusteriEkle(String tip,String ad,String soyad,int numara,int puan, int ödeme) {
        standartMusteriServisi.getMusteri(soyad);
    }
    

    public void hesapla(){
        standartMusteriServisi.hesapla();
       
    }
    
}
