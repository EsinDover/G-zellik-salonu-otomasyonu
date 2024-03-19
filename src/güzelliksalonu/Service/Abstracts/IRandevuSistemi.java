
package güzelliksalonu.Service.Abstracts;

import güzelliksalonu.Entity.Randevu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public interface IRandevuSistemi {
    
      void randevuEkle(Randevu randevu);
     void randevuKaldır(Randevu randevu);
     void randevulariListele();

     boolean randevuVarmi(Randevu randevu);
     void dosyayaRandevuEkle(Randevu randevu) ;

     void dosyadanRandevulariOku();

     void dosyadanRandevuSil(Randevu randevu);
    
}
