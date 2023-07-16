/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;


import Entidad.Calculo;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       Calculo calculo1 = new Calculo();
       
        calculo1.setNumero1(Math.random()*101);
        calculo1.setNumero(Math.random()*101);
       
       
        System.out.println("El mayor de los valores es: " + calculo1.devolverMayor());
        System.out.println("El menor de los valores es: " + calculo1.devolverMayor());
        System.out.println("La potencia es: " + calculo1.calcularpotencia());
        System.out.println("La raiz cuadrada es: " + calculo1.calcularRaiz());
        System.out.println("El valor absoluto es: " + calculo1.calcularRaiz());
    }
    
}
