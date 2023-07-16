
package digito;

import Entidad.Nif;
import Servicio.ServicioDni;


public class Digito {

  
    public static void main(String[] args) {
     
        ServicioDni sd = new ServicioDni();
        Nif nif = new Nif();
        
        sd.crearNif(nif);
        sd.mostrar(nif);
        
         
        
        
        
        
    }
    
}
