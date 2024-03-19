
package güzelliksalonu.Service;


import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.Abstracts.IKesimYapma;


public class KesimYapma  implements IKesimYapma{
  
    
    @Override
    public void Katlıkesim(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+25);
        System.out.println(musteri.getAd()+" Katlı kesim yapılıyor");
         System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
    }
    
    @Override
   public void Düzkesim(Musteri musteri){
       musteri.setPuan(musteri.getPuan()+30);
       System.out.println(musteri.getAd()+" Düz kesim yapılıyor.");
       System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
   }
}

    
    
    

