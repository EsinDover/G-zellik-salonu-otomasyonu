
package güzelliksalonu.Controller;

import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.BoyaYapmaİşlem;


public class BoyaYapmaIslemController {
    
    BoyaYapmaİşlem boyaYapmaİslem;

    public BoyaYapmaIslemController(BoyaYapmaİşlem boyaYapmaİslem) {
        this.boyaYapmaİslem = boyaYapmaİslem;
    }
    
    

    public void Sarısaç(Musteri musteri){
       
        boyaYapmaİslem.Sarısaç(musteri);
 
    }

    public void Kumralsaç(Musteri musteri){
        boyaYapmaİslem.Kumralsaç(musteri);
    }
    
   
    public void Siyahsaç(Musteri musteri){
        boyaYapmaİslem.Siyahsaç(musteri);
        
    }
    
    
    
    
}
