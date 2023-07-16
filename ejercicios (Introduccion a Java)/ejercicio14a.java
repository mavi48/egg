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
public class ejercicio14a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de € que desea convertir: ");
        double euro = leer.nextDouble();
        double[] cambio = {0.86, 1.29611, 129.852};
        String[] monedas = {"libras", "dólares", "yenes"};
        conversionMoneda(euro, cambio, monedas);
    }

    public static void conversionMoneda(double euro, double[] cambio, String[] monedas) {
        System.out.println("----------------------------------");
        for (int i = 0; i < cambio.length; i++) {
            double conversion = euro / cambio[i];
            System.out.println(euro + " € son: " + conversion + " " + monedas[i]);
        }
        System.out.println("----------------------------------");
    }
}
