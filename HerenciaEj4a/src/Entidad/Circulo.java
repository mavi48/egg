package Entidad;

import calculosFormas.InterfazCirculo;

public class Circulo implements InterfazCirculo {

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    

    @Override
    public double Area() {
        double PI = 3.14;

        double resultado = PI * radio * radio;
        
        return resultado;
    }

    @Override
    public double Perimetro(double diametro) {
        double PI = 3.14;

        double resultado = PI * diametro;
        System.out.println("el Perimetro del circulo es:" + resultado + " del circulo");
        return resultado;
    }
}
