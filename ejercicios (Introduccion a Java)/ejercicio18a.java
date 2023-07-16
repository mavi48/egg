/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;

import java.util.Random;

/**
 *
 * @author user
 */
public class ejercicio18a {

    public static void main(String[] args) {
        //Ejemplo para matriz cuadrada 
        int[][] matrizCuadrada = new int[4][4];
        inicializar(matrizCuadrada);
        System.out.println("Matriz cuadrada original\n");
        visualizar(matrizCuadrada);
        System.out.println("\n\nMatriz cuadrada transpuesta\n");
        visualizar(matrizCuadrada);

    }

    public static void transponerMatriz(int[][] matriz, int[][] transpuesta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }

    public static void inicializar(int[][] matriz) {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(50) + 1;
            }
        }
    }

    public static void visualizar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
