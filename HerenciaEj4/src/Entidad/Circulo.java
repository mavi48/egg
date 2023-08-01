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
    public double Area() {
        double PI = 3.14;
        double resultado = PI * radio * radio;
        System.out.println("el Area es:" + resultado + " del circulo");
        return resultado;
    }

    @Override
    public double Perimetro() {
        double PI = 3.14;
        double diametro = 0;
        double resultado = PI * diametro;
        System.out.println("el Perimetro es:" + resultado + " del circulo");
        return resultado;
    }
}
