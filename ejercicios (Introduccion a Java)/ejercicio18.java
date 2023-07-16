/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio18 {
    
 public static void main(String[] args) {
        //Ejemplo para matriz cuadrada 
        int[][] matrizCuadrada = new int[4][4];
        inicializar(matrizCuadrada);
        System.out.println("Matriz cuadrada original\n");
        visualizar(matrizCuadrada);
        transponerMatrizCuadrada(matrizCuadrada);
        System.out.println("\n\nMatriz cuadrada transpuesta\n");
        visualizar(matrizCuadrada);
         
        //Ejemplo para matriz (cuadrada o no)
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        inicializar(matriz);
        System.out.println("\nMatriz original\n");
        visualizar(matriz);     
        transponerMatriz(matriz, transpuesta);
        System.out.println("\n\nMatriz transpuesta\n");
        visualizar(transpuesta);
    }
     
    static void transponerMatriz(int[][] matriz, int[][] transpuesta){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
     
    static void transponerMatrizCuadrada(int[][] matriz){
        int aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){ if(i>j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }
    }
     
    static void inicializar(int[][] matriz){
         Random r = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(25) + 1; 
            }
        }
    }
 
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

