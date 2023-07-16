
package coleccionesej1;

import EntidadMascota.Mascota;
import ServicioMascota.ServicioMascota;
import java.util.Scanner;

public class ColeccionesEj1 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        ServicioMascota sm = new ServicioMascota();
        Mascota m = new Mascota();
      
        
       sm.crearMascota(m);
       sm.mostrarMascotas(m);
       sm.IterMasc();
       
     
    
    }
}   

