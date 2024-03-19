
package güzelliksalonu.Service;


import güzelliksalonu.DAO.DosyaIslemleri;
import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Service.Abstracts.IStandartMusteri;
import java.util.HashMap;
import java.util.Map;


public class StandartMusteriServisi implements IStandartMusteri{
    private Map<String, Musteri> musteriVeritabani;
    private String dosyaYolu = "musteri_veritabani.txt";
    private DosyaIslemleri dosyaIslemleri;

    private StandartMusteriServisi(DosyaIslemleri dosyaIslemleri) {
        this.dosyaIslemleri = dosyaIslemleri;
        musteriVeritabani = (Map<String, Musteri>) dosyaIslemleri.nesneyiDosyadanOku(dosyaYolu);
        if (musteriVeritabani == null) {
            musteriVeritabani = new HashMap<>();
        }
    }

   

    @Override
    public Musteri getMusteri(String musteriId) {
        return musteriVeritabani.get(musteriId);
    }

    @Override
    public void yeniMusteriEkle(String tip,String ad,String soyad,int numara,int puan, int ödeme) {
        Musteri musteri = MusteriFactory.createMüsteri(tip, ad, soyad, numara, puan, ödeme);
        
    }
    
    @Override
    public void hesapla(){
        int ucret = Ucretlendirme.getInstance().hesapla();
        System.out.println("Standart musteri ucreti "+ ucret);
    }
   
    
}
