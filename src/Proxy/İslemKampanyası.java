

package Proxy;

import güzelliksalonu.Entity.Musteri;



public class İslemKampanyası {
    Musteri musteri;
    
    public void Ücretsizİslem(){
        if(musteri.getPuan()<250 && musteri.getPuan()>200){
            System.out.println("Hediye edilecek işlem katlı kesimdir");
        }
        else if(musteri.getPuan()<300 && musteri.getPuan()>250){
            System.out.println("Hediye edilecek işlem düz kesimdir ");
        }
        else{
            System.out.println("İstediği işlem hediye edilir.");
        }
        
        
        
    }
    
}
