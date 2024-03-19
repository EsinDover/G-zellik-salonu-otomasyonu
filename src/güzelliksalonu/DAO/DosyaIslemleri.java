
package güzelliksalonu.DAO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DosyaIslemleri {
    
    public void nesneyiDosyayaYaz(Object nesne, String dosyaYolu) {
        try (ObjectOutputStream dosyaCikti = new ObjectOutputStream(new FileOutputStream(dosyaYolu))) {
            dosyaCikti.writeObject(nesne);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object nesneyiDosyadanOku(String dosyaYolu) {
        try (ObjectInputStream dosyaGirdi = new ObjectInputStream(new FileInputStream(dosyaYolu))) {
            return dosyaGirdi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
    

