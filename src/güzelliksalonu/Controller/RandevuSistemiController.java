
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Randevu;
import güzelliksalonu.Service.RandevuSistemi;



public class RandevuSistemiController {
    
    RandevuSistemi randevuSistemi;

    public RandevuSistemiController(RandevuSistemi randevuSistemi) {
        this.randevuSistemi = randevuSistemi;
    }
    
    
    
    

    public void randevuEkle(Randevu randevu) {
        randevuSistemi.randevuEkle(randevu);
        
       
    }


    public void randevuKaldır(Randevu randevu) {
      randevuSistemi.randevuKaldır(randevu);
    }

    public void randevulariListele() {
        randevuSistemi.randevulariListele();
        
    }


    public boolean randevuVarmi(Randevu randevu) {
        return randevuSistemi.randevuVarmi(randevu);
     
    }


     public void dosyayaRandevuEkle(Randevu randevu) {
         
         randevuSistemi.dosyayaRandevuEkle(randevu);
        
    }


     public void dosyadanRandevulariOku() {
         
         randevuSistemi.dosyadanRandevulariOku();
        
    }


     public void dosyadanRandevuSil(Randevu randevu) {
         randevuSistemi.dosyadanRandevuSil(randevu);
       
    }
    
}
