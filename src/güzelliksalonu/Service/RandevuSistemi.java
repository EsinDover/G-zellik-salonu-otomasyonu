
package güzelliksalonu.Service;

import güzelliksalonu.Entity.Randevu;
import güzelliksalonu.Service.Abstracts.IRandevuSistemi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RandevuSistemi implements IRandevuSistemi{
    private List<Randevu> randevular;
    private static final String DOSYA_ADI = "randevular.txt";

    public RandevuSistemi() {
        this.randevular = new ArrayList<>();
        dosyadanRandevulariOku();
    }

     @Override
    public void randevuEkle(Randevu randevu) {
        if (!randevuVarmi(randevu)) {
            randevular.add(randevu);
            System.out.println("Randevu eklendi: " + randevu);
            dosyayaRandevuEkle(randevu);
        } else {
            System.out.println("Bu tarih ve saatte başka bir randevu bulunmaktadır.");
        }
    }

     @Override
    public void randevuKaldır(Randevu randevu) {
        randevular.remove(randevu);
        System.out.println("Randevu kaldırıldı: " + randevu);
        dosyadanRandevuSil(randevu);
    }

     @Override
    public void randevulariListele() {
        if (randevular.isEmpty()) {
            System.out.println("Mevcut randevu bulunmamaktadır.");
        } else {
            System.out.println("Randevular:");
            for (Randevu randevu : randevular) {
                System.out.println(randevu);
            }
        }
    }

     @Override
    public boolean randevuVarmi(Randevu randevu) {
        return randevular.contains(randevu);
    }

     @Override
     public void dosyayaRandevuEkle(Randevu randevu) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DOSYA_ADI, true))) {
            writer.write(randevu.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     @Override
     public void dosyadanRandevulariOku() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DOSYA_ADI))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
               
                
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     @Override
     public void dosyadanRandevuSil(Randevu randevu) {
        
    }

    
}

    