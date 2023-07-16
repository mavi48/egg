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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        String frase = leer.nextLine();
       String S1 = new String("frase");
       System.out.println(S1.toLowerCase());
       System.out.println(S1.toUpperCase());
    }
    
}
