
package Servicio;

import Entidad.Edificio;
import Interfases.IEdificio;

//public class ServEdificio extends edifi implements IEdificio==
public class ServEdificio extends Edificio implements IEdificio{
    
    Edificio ServEdificio;

    public ServEdificio(Edificio ServEdificio, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.ServEdificio = ServEdificio;
    }

    public ServEdificio(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }

  

    public Edificio getServEdificio() {
        return ServEdificio;
    }

    public void setServEdificio(Edificio ServEdificio) {
        this.ServEdificio = ServEdificio;
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
    public String facilidad(){
        String facilidad = null;
        return facilidad;
    }
    
}
