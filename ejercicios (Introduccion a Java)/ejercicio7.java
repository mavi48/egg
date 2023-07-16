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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
          System.out.println("ingrese palabra");
        String cadena1 = leer.nextLine();
          String eureka = "eureka";
         
        if(!cadena1.equals(eureka)){
            System.out.println("no son iguales");
        }else{
            System.out.println(" son iguales");
        }
        
    }
    
}
