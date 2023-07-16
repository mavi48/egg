/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Datos;

import java.util.*;



public class ServicioPersonita {

    Scanner leer = new Scanner(System.in);

    public Datos crearPersonita() {

        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
       
        System.out.println("Ingrese su fecha de nacimiento:");
        String Fecha = leer.next();
        System.out.println("Nombre: " + nombre + " Fecha de nacimiento: " + Fecha);
        System.out.println("----------------------------");

        return new Datos();

    }

    public boolean menorQue() {
        // Scanner leer = new Scanner(System.in);

        System.out.println("Para comprobar si es Mayor o Menor, ingrese la edad:");
        int edad1 = leer.nextInt();
        if (edad1 > 18) {
            System.out.println("true");
            System.out.println("--------------------------------");
        } else {

            System.out.println("false");
            System.out.println("--------------------------------");
        }
        return false;
    }

    public void calcularEdad() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su dia de nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento:");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento:");
        int anio = leer.nextInt();

        Date Fecha = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Resumen:");
        String nombre = toString();
        System.out.println("Su nombre es:" + nombre);
        System.out.println("Fecha de nacimiento:" + Fecha);
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);

        int difAnios = fechaActual.getYear() - Fecha.getYear();

        System.out.println("Tiene: " + difAnios + "años");
        System.out.println("");
        System.out.println("--------------------------------");

    }
}
