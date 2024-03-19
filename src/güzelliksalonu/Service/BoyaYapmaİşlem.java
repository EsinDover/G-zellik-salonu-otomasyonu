
package güzelliksalonu.Service;


import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.Abstracts.IBoyaYapma;


public class BoyaYapmaİşlem implements IBoyaYapma{
    
    
    
    @Override
    public void Sarısaç(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+30);
        System.out.println(musteri.getAd()+" Saçları sarıya boyuyor.");
        System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
        
 
    }
    @Override
    public void Kumralsaç(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+50);
        System.out.println(musteri.getAd()+" Saçları kumrala boyuyor.");
        System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
                
    }
    @Override
    public void Siyahsaç(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+60);
        System.out.println(musteri.getAd()+ " Saçları siyaha boyuyor.");
        System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
    }
            
            
}
    
    
    

