
package Entidad;

import calculosFormas.InterfazRectangulo;


public class Rectangulo implements InterfazRectangulo{
    
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double Area(double base,double altura) {
        
       double resultado= base * altura;
       System.out.println("el Area del rectangulo es:" + resultado); 
       return resultado;
    }

    @Override
    public double Perimetro(double base,double altura) {
        
       double resultado= (base + altura)*2;
       System.out.println("el  Perimetro del  rectangulo es: " + resultado ); 
       return resultado;
    }



    
    
    
    
}
