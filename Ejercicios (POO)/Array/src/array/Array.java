/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Array {

  
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String meses = " ";
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "novimbre", "diciembre"};
        int tamaño = (int)Math.round(Math.random()*11);
        String mesSecreto = mes[tamaño];
        System.out.println(tamaño);
        System.out.println("Ingrese el mes elegido:");
        meses = leer.nextLine();

        while (!meses.equalsIgnoreCase(mesSecreto)) {
            System.out.println("No ha acertado,intentelo nuevamente");
            meses = leer.nextLine();
        }
        System.out.println("Ha acertado!");
    }

}
