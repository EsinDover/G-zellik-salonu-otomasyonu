
package güzelliksalonu.Entity;



public class OzelMusteri extends Musteri {
        
    public OzelMusteri(String ad, String soyad, int telefon, int puan, int ödeme) {
        
        super(ad, soyad, telefon, puan, ödeme);
        this.setIndirim(0.3f);
    }

    

    @Override
    public String toString() {
        return "OzelMusteri{" + '}';
    }
    
    
    
    
}
