/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;



import circunferencia.Entidades.partes;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        
     partes primerDato = new partes(0.0);
     Scanner leer =new Scanner(System.in);
     System.out.println("Ingrese el radio del circulo:");
     primerDato.setRadio(leer.nextDouble());
        double area = primerDato.area();
   }

   
      public double area(double Radio) {

     double area = 3.1416 * Radio * Radio;
        return area;
    }
    }

