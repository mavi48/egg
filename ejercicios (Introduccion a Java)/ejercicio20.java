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
public class ejercicio20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][]matriz=new int[3][3];
        int sumaFila =0;
        int count = 0;
        int sumaColumna = 0;
        mostrar( matriz);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != sumaColumna) {
                System.out.println("No es magico!!!");
                mostrar(matriz);
                return;
            } else {
                count++;
                if (count == 3) {
                    System.out.println("Es magico!!");
                    mostrar(matriz);
                   return;
                            
                 }else {
                    sumaFila = 0;
                    sumaColumna = 0;
                }
        }
    }}
    private static boolean esIgual(int sumaFila,int sumaColumna){
        return sumaFila == sumaColumna;
}

    public static void mostrar(int[][] matriz) {
       
         Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el dato de la fila " );
                int dato = leer.nextInt();
                matriz[i][j] = dato;
            }
           
        }
    }}

 


