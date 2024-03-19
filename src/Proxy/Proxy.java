
package Proxy;

import güzelliksalonu.Entity.Musteri;


public class Proxy {
    
    Musteri musteri;

    public Proxy(Musteri musteri) {
        this.musteri = musteri;
    }
    
    
    
    public void karsilastir(){
        if(musteri.getPuan()<100){
            İndirimKampanyası indirimKampanyası = new İndirimKampanyası();
            indirimKampanyası.İndirimiUygula();
           
            
        }
        else if(musteri.getPuan()>100 && musteri.getPuan()<200){
            HediyeKampanyası hediyeKampanyası = new HediyeKampanyası();
            hediyeKampanyası.HediyeEt();
        }
            
        else {
                    İslemKampanyası islemKampanyası = new İslemKampanyası();
                    islemKampanyası.Ücretsizİslem();
                            
                    }             
            
            
        }
        
    }    
    
    
    
    
    

