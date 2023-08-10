
package herenciaextrasej2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/*Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/


public class HerenciaExtrasEj2 {

   
    public static void main(String[] args) {
      
    ArrayList <Edificio> edificioslist = new ArrayList<>();
    
    edificioslist.add(new Polideportivo("Estadio monumental","Estadio de futbol",500d,50d,500d));
    edificioslist.add(new EdificioDeOficinas( 50,120,6,300d,40d,200d));
    edificioslist.add(new Polideportivo("Estadio Bombonera","Estadio de futbol",490d,40d,350d));
    edificioslist.add(new EdificioDeOficinas( 30,190,9,390d,38d,290d));
  
        for(Edificio edificiox: edificioslist ) {
            System.out.println("La superficie es: " + edificiox.calcularSuperficie());
            System.out.println("El volumen es: " + edificiox.calcularVolumen());
        }
    
    }
    
}
