
package coleccionesej4;

import EntidadPelicula.Pelicula;
import ServicioPeliculas.ServicioPeliculas;
import java.util.Scanner;


public class ColeccionesEj4 {

  
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
      ServicioPeliculas sp = new ServicioPeliculas();
       Pelicula p = new Pelicula();
       
    sp.crearPelicula(p);
    //sp.peliculasCargadas();
    sp.mostrarPelicula();
    sp.MayorDuracion();
    sp.MenorDuracion();
    sp.MayorUnaHora();
    sp.ordenadoTitulo();
    sp.ordenadoDirector();
    }
}
