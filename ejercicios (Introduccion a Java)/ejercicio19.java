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
public class ejercicio19 {

    public static void main(String[] args) {

         Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimension de la matriz");
        int num = leer.nextInt();
        while (num < 1) {
            System.out.println("ERROR!Ingrese dimension positiva");
            num = leer.nextInt();
        }
        int[][] matriz = new int[num][num];

        cargar(matriz);
        verificar(matriz);
        mostrar(matriz);
    }

    public static void cargar(int[][] matriz) {
        //cargar matriz
          Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("ingrese el valor en la posicion[" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();

            }
        }
    }
    //VERIFICAR MATRIZ

    public static void verificar(int[][] matriz) {
        boolean log = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -matriz[i][j]) {
                    log = true;
                }
            }

        }
        if (log) {
            System.out.println("La matriz es antiSimetrica");
        } else {
            System.out.println("La matriz no es antiSimetrica");
        }
    }

    public static void mostrar(int[][] matriz) {
        System.out.println("Matriz cargada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpuesta de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }

    }
}

