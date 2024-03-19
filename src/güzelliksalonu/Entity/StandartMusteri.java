
package güzelliksalonu.Entity;



public class StandartMusteri extends Musteri{

    public StandartMusteri(String ad, String soyad, int telefon, int puan, int ödeme ) {
        super(ad, soyad, telefon, puan, ödeme);
        this.setIndirim(0.2f);
    }

    @Override
    public String toString() {
        return "StandartMusteri{" + '}';
    }

   
    
    
    
    
}
