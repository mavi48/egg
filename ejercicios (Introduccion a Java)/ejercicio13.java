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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.print("Ingrese el tamaño del cuadrado:"); 
         int n = leer.nextInt();
         
         if(n >= 0 && n <= 50 ){
             
            for(int i=0;i<n;i++){            // sup
                 System.out.print("*");
                }
             System.out.println();
             
               for(int i=0;i<n-2;i++){       //centro 
                 System.out.print("*");
                for(int j=0;j<=n-2;j++){       
                 System.out.print(" ");
         }
           System.out.println("*");     
          }
               for(int i=0;i<n;i++){            // inf
                 System.out.print("*");       
           }
         }else{
           System.out.println("error.el dato debe estar entre 0 y 50");   
         }
    }
}
