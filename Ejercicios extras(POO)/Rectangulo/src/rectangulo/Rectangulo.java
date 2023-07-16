/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Entidad.asterisco;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        asterisco n1 = new asterisco();

        System.out.print("Ingrese la altura:");
        n1.setAltura(leer.nextInt());
        System.out.print("Ingrese la base:");
        n1.setBase(leer.nextInt());
        System.out.println(n1.superficie() + " es el area del rectangulo ");
        
        System.out.println( n1.Perimetro() + " es el area del  perimetro ");
        
        System.out.println("dibujar el rectangulo con asteriscos:" );
        
        n1.dibujar();
        

       
        
    }
}
