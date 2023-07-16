/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Arreglo {

   
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        
        double[] arregloB = new double[20];
        

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random()*100+1);
             //System.out.print("[ " + arregloA[i] + "]" );
          }
       // for (int i = 0; i < arregloA.length; i++) {
           //System.out.print("[ " + arregloA[i] + "]" );
        //}
        System.out.println("Aqui esta el vector A :");
        System.out.println( Arrays.toString(arregloA));
        System.out.println("Aqui esta el vector de menor a mayor :");
        Arrays.sort(arregloA);
        System.out.println( Arrays.toString(arregloA));
        
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        System.out.println("Aqui esta el arregloB: ");
        Arrays.fill(arregloB,10, 20 ,0.5 );
        System.out.println( Arrays.toString(arregloB));
        
        
    }


     
   }
    
    
    
    
    

