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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        int i = 0;
        
       
            
        if(numero % 2 == 0){
            
            System.out.println("el numero es par"); 
        }else{
            System.out.println("el numero es impar");
        }
    }
    }  

