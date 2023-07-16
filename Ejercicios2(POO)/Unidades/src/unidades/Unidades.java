/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidades;

import Entidad.numLetras;
import java.util.Scanner;


public class Unidades {

  
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
       numLetras nl = new numLetras();
        int num = 0;
       
       do{
           System.out.println("Ingresa un numero");
            num = leer.nextInt();
            
            if(num>=1 && num<=999){
                System.out.println(nl.cambiar(num));
            }else{
                System.out.println("ingresa un numero menor a 1000");
            }
           
        }while(num <=1 && num >=1000);
       
       }
        
}  
        
        
    
    

