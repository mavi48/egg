
package herenciaej4;

import Entidad.Circulo;
import Entidad.Rectangulo;


public class HerenciaEj4 {

  
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        
       c1.Area();
       c1.Perimetro();
        
       /* Circulo c2 = new Circulo(1,3.14,3.9);
        
        c1.Area(3.14, 3);
        c1.Perimetro(0.6, 20);
        c2.Perimetro(6, 3.5);*/
        
        Rectangulo rec = new  Rectangulo();
         
        rec.Area();
        rec.Perimetro();
      
    }
    
}
