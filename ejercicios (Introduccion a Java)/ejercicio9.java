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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       
        System.out.println("ingrese frases o palabras ");
        String cadena1 = leer.next();
        String cadenaA = "A";
        
        System.out.println(cadena1.substring(0,1));
        
        if(!(cadena1.substring(0,1)).equals(cadenaA)){
            
            System.out.println("INCORRECTO ");
        }else{
            System.out.print("CORRECTO");
        }
    }}
    

