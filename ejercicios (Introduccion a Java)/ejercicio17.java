/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       
         System.out.println("ingresa un numero");
        int num = leer.nextInt(); 
        
       sonCincoDigitos();
         
        int cifras = cuentaCifras(num);
         
        System.out.println("Numero de cifras: " + cifras);
         
    }
    public static int sonCincoDigitos() {
        
    double cincoDigitos = 10000 + Math.random() * 90000;
    
    return (int) cincoDigitos;
}
 
    public static int cuentaCifras(int num) {
 
        int contador = 0;
 
        if (num == 0) {
            contador = 1;
        } else {
 
            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
 
        }
 
        return contador;
    }
}
