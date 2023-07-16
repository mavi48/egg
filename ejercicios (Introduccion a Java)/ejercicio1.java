/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;

/**
 *
 * @author user
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int resultado =sumaNumeros(5,6);
       System.out.println(resultado);
    }
     public static int sumaNumeros(int num1,int num2){
         int resultado = num1 + num2;
         return resultado;
     }
}
