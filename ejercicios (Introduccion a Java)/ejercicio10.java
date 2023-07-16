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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor limite");
        int num1=leer.nextInt();
        
         int suma=0;
         boolean t= true;
      do{
         
        System.out.println("Ingrese los numeros");
        num1 = leer.nextInt();
       
       suma=num1+suma;
    }while(t);
       System.out.println("el valor es:" +suma);
      }
}
