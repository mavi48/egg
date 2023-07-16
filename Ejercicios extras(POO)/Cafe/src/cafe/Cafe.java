/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafeteraUno = new Cafetera();
        System.out.print("Ingresar la capacidad maxima de la cafetera: ");
        cafeteraUno.setCapacidadMaxima(leer.nextInt());
        System.out.print("Ingrese la cantidad actual de la cafetera: ");
        cafeteraUno.setCantidadActual(leer.nextInt());

        int opcion;
        do {

            System.out.println("-------------------------------");
            System.out.println("programa Nespresso");
            System.out.println("-------------------------------");
            System.out.println("Elija una opcion del Menu");
            System.out.println("1.Servir una taza");
            System.out.println("2.Aumentar cafe a la cafetera");
            System.out.println("3.Vaciar la cafetera");
            System.out.println("4.Salir ");
            System.out.println("--------------------------------");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de cafe de la taza: ");
                    cafeteraUno.servirTaza(leer.nextInt());
                    System.out.println("Cantidad actual de café: " + cafeteraUno.getCantidadActual());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad que desea añadir a la cafetera: ");
                    cafeteraUno.setAdicion(leer.nextInt());
                    System.out.println("Cantidad actual de café: " + cafeteraUno.agregarCafe());
                    cafeteraUno.setCantidadActual(cafeteraUno.agregarCafe());
                    break;
                case 3:

                    System.out.println("Cantidad actual de café: " + cafeteraUno.getCantidadActual());
                    cafeteraUno.setCantidadActual(cafeteraUno.vaciarCafetera());
                    System.out.println("La cafetera se vacio, la cantidad actual es: " + cafeteraUno.getCantidadActual());
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opcion != 4);
    }

}
