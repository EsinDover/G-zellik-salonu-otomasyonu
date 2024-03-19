/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package güzelliksalonu;

import Proxy.Proxy;
import güzelliksalonu.Controller.BoyaYapmaIslemController;
import güzelliksalonu.Controller.KesimYapmaController;
import güzelliksalonu.Controller.RandevuSistemiController;
import güzelliksalonu.Entity.Musteri;
import güzelliksalonu.Entity.Randevu;
import güzelliksalonu.Service.BoyaYapmaİşlem;
import güzelliksalonu.Service.KesimYapma;
import güzelliksalonu.Service.MusteriFactory;
import güzelliksalonu.Service.RandevuSistemi;
import güzelliksalonu.Service.Ucretlendirme;


public class GüzellikSalonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musteri yaren = new Musteri( "yaren");
        Musteri esin = new Musteri( "esin");
        Musteri aleyna = new Musteri( "aleyna");
        
        KesimYapmaController k = new KesimYapmaController(new KesimYapma());
        
        BoyaYapmaIslemController b = new BoyaYapmaIslemController(new BoyaYapmaİşlem());
        
        System.out.println("Kesim yapmadan once: "+yaren.getPuan());
        k.Düzkesim(yaren);
        System.out.println("Düz kesim yaptıktan sonra: "+yaren.getPuan());
        
        k.Katlıkesim(yaren);
        System.out.println("katlı kesim yaptıktan sonra: "+yaren.getPuan());
        
        k.Düzkesim(yaren);
        k.Düzkesim(yaren);
        

        
       Proxy p = new Proxy(yaren);
       p.karsilastir();
       
       
       System.out.println("-------------------------------------------------------");
        
       
       
       Musteri esin2 = MusteriFactory.createMüsteri("özel", "esin", "döver", 0, 0, 0);
       Musteri yaren2 = MusteriFactory.createMüsteri("standart", "yaren", "yalcinkaya", 0, 0, 0);
       
        System.out.println(esin2);
        System.out.println(yaren2);
        
        
        System.out.println("-------------------------------------------------------");
        
        
        b.Sarısaç(esin);
        
        
        
        System.out.println("-------------------------------------------------------");
        
        
        
        
        Ucretlendirme u1= Ucretlendirme.getInstance();
        Ucretlendirme u2= Ucretlendirme.getInstance();
        if (u1==u2) {
            System.out.println("Birbirine esit");
               
        }
        else{
            System.out.println("Esit degil");
        }
        
            
        System.out.println("-------------------------------------------------------");
          
        
        RandevuSistemiController r = new RandevuSistemiController(new RandevuSistemi());
        r.dosyayaRandevuEkle(new Randevu(esin,"10.02.2024",15));
        r.dosyadanRandevulariOku();
        
        
        
        
        
        
        
        
    }
    
}
