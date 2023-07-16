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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresa un numero");
        int numero = leer.nextInt(); 
        doble(numero);
        triple(numero);
        System.out.println("la raiz cuadrada es:" + (Math.sqrt(numero)));
       
    }
    public static void doble(int numero){
        int doble;
        doble = 2*numero;
        System.out.println("El doble es:"+doble);
    }
     public static void triple(int numero){
        int triple;
        triple = 3*numero;
        System.out.println("El triple es:"+triple);
}
     
}