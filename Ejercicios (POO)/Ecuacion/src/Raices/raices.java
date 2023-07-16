/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raices;

/**
 *
 * @author user
 */
public class raices {
    double a;
    double b;
    double c;
    double getDiscriminante;

    public raices(double getDiscriminante) {
        this.getDiscriminante =  Math.pow(b,2) - (4*a*c);
    }
    
    
    public raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public raices() {
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}  
    
    
    

