
package güzelliksalonu.Entity;


public class Randevu {

    public Randevu() {
    }
    
    private Musteri musteri;
    private String tarih;
    private int saat;
    
    
    
    
    
    public Randevu(Musteri musteri , String tarih, int saat){
        this.musteri= musteri;
        this.tarih=tarih;
        this.saat=saat;
        
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }
    
    public String toString(){
            return "Randevu{" +
                "musteri=" + musteri +
                ", tarih='" + tarih + '\'' +
                ", saat='" + saat + '\'' +
                '}';
    }
    
    
    
    
}

    

