
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.ŞekillendirmeYapmaİşlem;


public class SekillendirmeYapmaIslemController {
    
    
    ŞekillendirmeYapmaİşlem sekillendirmeYapmaIslem;

    public SekillendirmeYapmaIslemController(ŞekillendirmeYapmaİşlem sekillendirmeYapmaIslem) {
        this.sekillendirmeYapmaIslem = sekillendirmeYapmaIslem;
    }
    
    
    
    
    public void FonCekme(Musteri musteri){
        sekillendirmeYapmaIslem.FonCekme(musteri);
    }

   
  
    public void MasaYapma(Musteri musteri){
        sekillendirmeYapmaIslem.MasaYapma(musteri);
        
    }
}
