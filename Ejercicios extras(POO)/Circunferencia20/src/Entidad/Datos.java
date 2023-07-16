/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class Datos {

    private double Radio;

    public Datos(double Radio) {
        this.Radio = Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }
    public double Area() {

        return Math.PI * this.Radio * this.Radio;
    }

    public double Perimetro() {

        return 2 * Math.PI * this.Radio;

    }

    public void mostrar() {
        System.out.println("El radio es " + Radio + " con un area de " + Area());
        System.out.println("El perimetro es: " + Perimetro());
    }
}
