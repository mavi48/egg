/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia20;

import Entidad.Datos;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Circunferencia20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        r = leer.nextDouble();
        Datos primerDato = new Datos(r);
        Datos segundoDato = new Datos(r);
        primerDato.mostrar();
        segundoDato.mostrar();
    }

}
