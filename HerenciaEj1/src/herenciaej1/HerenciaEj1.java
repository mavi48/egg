
package herenciaej1;

import HerenciaEntidades.Animal;
import HerenciaEntidades.Caballo;
import HerenciaEntidades.Gato;
import HerenciaEntidades.Perro;


public class HerenciaEj1 {

   
    public static void main(String[] args) {
      
        Perro perro = new Perro("Bambi","croquetas",2,"Pastor Aleman");
        Gato gato = new Gato("Juanita","balanceado",10, "Angora");
        Animal caballo = new Caballo("Pancho","heno", 9, "Mustang");

        perro.alimentoAnimal();
        gato.alimentoAnimal();
        caballo.alimentoAnimal();
    }
    
}
