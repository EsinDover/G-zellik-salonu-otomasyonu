
package güzelliksalonu.Service;


import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.Abstracts.ISekillendirmeYapma;


public class ŞekillendirmeYapmaİşlem implements ISekillendirmeYapma{
    
     
    
     @Override
    public void FonCekme(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+35);
        System.out.println(musteri.getAd()+" Fön çekimi yapılıyor.");
        System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
    }

   
    @Override
    public void MasaYapma(Musteri musteri){
        musteri.setPuan(musteri.getPuan()+40);
        System.out.println(musteri.getAd()+" Maşa yapılıyor ");
        System.out.println(musteri.getAd()+" puanı: "+musteri.getPuan());
    }
}
    
    
    

