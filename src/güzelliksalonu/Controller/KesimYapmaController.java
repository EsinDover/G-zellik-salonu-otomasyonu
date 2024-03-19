
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.KesimYapma;


public class KesimYapmaController {
    
     
    KesimYapma kesimYapma;

    public KesimYapmaController(KesimYapma kesimYapma) {
        this.kesimYapma = kesimYapma;
    }
    
    
    
    public void Katlıkesim(Musteri musteri){
        kesimYapma.Katlıkesim(musteri);
        
    }
    

   public void Düzkesim(Musteri musteri){
       kesimYapma.Düzkesim(musteri);
   }
    
}
