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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        
        System.out.println("ingrese frases o palabras ");
        String palabra = leer.nextLine();
        int longitud = palabra.length();
        
        if (longitud == 8){
           System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        }
    
}
