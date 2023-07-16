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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         double gradosC, gradosF;
         System.out.println("Introduce grados Centígrados:");
         gradosC = sc.nextDouble();
         gradosF = 32 + (9 * gradosC / 5);
         System.out.println(gradosC +" ºC = " + gradosF + " ºF");                                                 
  }
    }
    

