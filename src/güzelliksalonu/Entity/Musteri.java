
package güzelliksalonu.Entity;


public class Musteri {
    
    private String ad;
    private String soyad;
    private int telefon;
    private int puan;
    private float indirim;
    private int ödeme;
   

    public Musteri(String ad, String soyad, int telefon, int puan, int ödeme) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.puan = puan;
        this.indirim = indirim;
        this.ödeme = ödeme;
        
    }

    public Musteri(String ad) {
        this.ad = ad;
    }

    
    
    
    
    
    public Musteri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
    
    public float getIndirim() {
        return indirim;
    }

    public void setIndirim(float indirim) {
        this.indirim = indirim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public int getÖdeme() {
        return ödeme;
    }

    public void setÖdeme(int ödeme) {
        this.ödeme = ödeme;
    }

    @Override
    public String toString() {
        return "Musteri{" + "ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + '}';
    }
    
    
    
    
    
    
}
