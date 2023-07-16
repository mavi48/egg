/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double resultado;

        System.out.println("Ingrese un numero entero positivo");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        int num2 = leer.nextInt();
        boolean salir = true;
        do {

            System.out.println("ingrese la opcion correspondiente a la operacion que desea:");
            System.out.println("1._Sumar 2._Restar 3._Multiplicar 4._Dividir 5._Salir");
            int respuesta = leer.nextInt();

            switch (respuesta) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("La suma da como resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("La resta da como resultado " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("La multiplicacion da como resultado: " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("La division da como resultado: " + resultado);
                    break;
                case 5:

                    System.out.println("Esta seguro que desea salir del programa?(S/N )");
                    String out = leer.next().toLowerCase();
                    if (out.equals("n")) {
                        salir = true;

                    } else {
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("la opcion ingresada no es valida,elija una opcion del menu:");
                    break;
            }
        } while (salir);
    }
}
