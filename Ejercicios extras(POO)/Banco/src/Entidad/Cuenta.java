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
public class Cuenta {

    public int numeroCuenta;
    public int DNI;
    public int saldoActual;
    public int interes;
    public double ingreso;
    public double retiro;
    public int depositar;

    public int getDepositar() {
        return depositar;
    }

    public void setDepositar(int depositar) {
        this.depositar = depositar;
    }

    public Cuenta(int depositar) {
        this.depositar = depositar;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    public double ingresar(){
        return saldoActual + ingreso;
    }
     public double retirar(){
        return saldoActual - ingreso;
    }public int depositar(){
        return saldoActual + depositar;
    }public double retiroRapido(){
        return saldoActual -(saldoActual*0.2);
    }
}
     

