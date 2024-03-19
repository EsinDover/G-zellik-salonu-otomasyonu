
package güzelliksalonu.Service;

import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Entity.OzelMusteri;
import güzelliksalonu.Entity.StandartMusteri;




public class MusteriFactory  {

    
    public static Musteri createMüsteri(String tip,String ad, String soyad, int numara, int puan,int ödeme) {
        
        if(tip.equals("özel")){
         return new OzelMusteri(ad, soyad, numara,puan,ödeme );   
        }
        else if(tip.equals("standart")){
            return new StandartMusteri(ad, soyad, 4,7,4);
        }
        
        return null;
        
    }

    
    
    
}
