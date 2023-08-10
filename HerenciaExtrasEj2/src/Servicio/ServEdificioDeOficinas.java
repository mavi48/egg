package Servicio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Interfases.IEdificioDeOficinas;

public class ServEdificioDeOficinas extends Edificio implements IEdificioDeOficinas {

    public ServEdificioDeOficinas(double ancho, double alto, double largo) {
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

    @Override
    public int calcularPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        
    }
