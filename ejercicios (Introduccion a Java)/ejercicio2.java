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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        
        System.out.println("pide el nombre y lo muestra en pantalla");
        
        System.out.println("Ingresa tu nombre:");
        String nombre = leer.nextLine();
        System.out.println(nombre);
    }
    
}
