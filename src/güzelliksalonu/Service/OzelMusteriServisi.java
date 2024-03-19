
package güzelliksalonu.Service;


import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.DAO.DosyaIslemleri;
import güzelliksalonu.Service.Abstracts.IOzelMusteri;
import java.util.HashMap;
import java.util.Map;


public class OzelMusteriServisi implements IOzelMusteri{
    private Map<String, Musteri> musteriVeritabani;
    private String dosyaYolu = "musteri_veritabani.txt";
    private DosyaIslemleri dosyaIslemleri;

    private OzelMusteriServisi(DosyaIslemleri dosyaIslemleri) {
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
    public void yeniMusteriEkle(String tip,String ad,String soyad,int numara,int puan,int ödeme) {
        Musteri musteri = MusteriFactory.createMüsteri(tip, ad, soyad, numara, puan,ödeme);
        
    }
    
    @Override
    public void hesapla(){
        
        double indirimyuzdesi = 0.5;
        int ucret = Ucretlendirme.getInstance().hesapla();
        double toplamucret = ucret*indirimyuzdesi;
        System.out.println("Ozel musteri ucreti "+toplamucret);
    }
    
    
}
