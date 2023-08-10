
package Servicio;

import Entidad.Edificio;
import Entidad.Polideportivo;
import Interfases.IPolideportivo;




public class ServPolideportivo extends Edificio implements IPolideportivo {

    public ServPolideportivo(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }
    
    
     @Override
    public double calcularSuperficie() {
    
        
        double superficie = alto * ancho * largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
      
        double volumen = largo * ancho;
        return volumen;
    }
    
  
    }
    

