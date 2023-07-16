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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int a=100;
        
        int arreglo[] = new int[a];
        for(int i= 0;i < a;i++){
            
         arreglo[i]=100-i;
        }
         r(arreglo,a);
        }
       
         public static void  r(int[] arreglo,int a) {
       
        
         
         for(int i=8;i<a;i++){
              System.out.println("["+ " numero:"+arreglo[i] +"]");
         }}
}
         
    

