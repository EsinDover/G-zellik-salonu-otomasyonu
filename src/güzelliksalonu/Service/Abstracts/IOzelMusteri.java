
package güzelliksalonu.Service.Abstracts;


import güzelliksalonu.Entity.Musteri;


public interface IOzelMusteri {
    
    public Musteri getMusteri(String musteriId);
    public void yeniMusteriEkle(String tip,String ad,String soyad,int numara,int puan,int ödeme);
    public void hesapla();
    
}
