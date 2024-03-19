
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.MusteriFactory;
import güzelliksalonu.Service.OzelMusteriServisi;
import güzelliksalonu.Service.Ucretlendirme;

public class OzelMusteriServisiController {
    
    OzelMusteriServisi ozelMusteriServisi;

    public OzelMusteriServisiController(OzelMusteriServisi ozelMusteriServisi) {
        this.ozelMusteriServisi = ozelMusteriServisi;
    }
    
       
    
    
     public Musteri getMusteri(String musteriId) {
      return ozelMusteriServisi.getMusteri(musteriId);
    }

 
    public void yeniMusteriEkle(String tip,String ad,String soyad,int numara,int puan,int ödeme) {
        ozelMusteriServisi.yeniMusteriEkle(tip, ad, soyad, numara, puan, ödeme);
        
    }
   
    
    public void hesapla(){
        
        ozelMusteriServisi.hesapla();
        
    }
    
}
