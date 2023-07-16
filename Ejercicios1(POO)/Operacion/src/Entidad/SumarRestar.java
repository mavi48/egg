/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class SumarRestar {

    private double numero1;

    private double numero2;

    public SumarRestar(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public SumarRestar() {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public void mostrarsumar() {
        System.out.println("el resultado de la suma es: " + sumar());
    }

    public double restar() {
        return numero1 - numero2;
    }

    public void mostrarrestar() {
        System.out.println("el resultado de la resta  es: " + restar());
    }

    public double multiplicar() {
        return numero1 * numero2;

    }

    public void mostrarmultiplicar() {
        System.out.println("el resultado de la multiplicacion es: " + multiplicar());
    }

    public double multiplicar1() {
        if (numero1 == 0 || numero2 == 0) {

        }
        return 0;
    }

    public void mostrarmultiplicar1() {
        System.out.println("la multiplicacion es = 0 ;ERROR ");
    }

    public double dividir() {
        return numero1 / numero2;
    }

    public void mostrardividir() {
        System.out.println("el resultado de la division es: " + dividir());
    }

    public double dividir1() {
        if (numero1 == 0 || numero2 == 0) {

        }
        return 0;
    }

    public void mostrardividir1() {
        System.out.println("la division es = 0;ERROR " );
    }
}
