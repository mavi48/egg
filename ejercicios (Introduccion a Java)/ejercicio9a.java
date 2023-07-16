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
public class ejercicio9a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("ingrese una frase, validare si tiene la a al inicio");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        frase=frase.toLowerCase();
        char letter= frase.charAt(0);
        //String letra=frase.substring(0, 1);
        if (letter!='a'){
        
        System.out.println("INCORRECTO");
        }else{System.out.println("CORRECTO");}
        System.out.println(letter);
    }
    
}
