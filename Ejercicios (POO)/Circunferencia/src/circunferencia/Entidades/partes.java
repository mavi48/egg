/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia.Entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class partes {

    private double Radio;

    public partes(double Radio) {
        this.Radio = Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public double area() {

        return (3.1416) * (Radio * Radio);
    }

}
