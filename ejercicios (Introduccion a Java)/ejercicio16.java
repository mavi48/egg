/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;



import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         int[]num = new int [5];
         num[0]=2;
         num[1]=5;
         num[2]=3;
         num[3]=3;     
         num[4]=8; 
         
         int pos= -1;       //posicion
         
         System.out.println("Ingrese un numero");
         int n = leer.nextInt();
         for(int i=0;i <num.length;i++){
             if(num[i]== n){
                 pos=i;
             }
         }
         if(pos == -1){
             System.out.println("No se encontro el numero");
         } else{
            System.out.println("La posicion de "+ n +" es "+ pos);
          
         }
          Arrays.sort(num);
          int contador=0;
          
          for(int i=0;i<num.length;i++){
            int aux = 0;
             if(aux==num[i]){
                 contador++;
             }else{
                System.out.println("el numero" + num[i] + "se repite" + contador + "veces");
                 contador=1;
                 aux=num[i];
             }
   }         
    }                              
}
    
    
          



   
    
     
           
         
       
    


