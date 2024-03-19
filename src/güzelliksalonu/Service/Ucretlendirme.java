
package güzelliksalonu.Service;


public class Ucretlendirme {
    
    private static Ucretlendirme instance;

    private Ucretlendirme() {
    }

    public static güzelliksalonu.Service.Ucretlendirme getInstance() {
        
        if(instance == null){
            instance = new Ucretlendirme();
        }
        return instance;
    }
    
    public int hesapla(){
        //ucret hesabı
        return 1;
    }
    
    
}
