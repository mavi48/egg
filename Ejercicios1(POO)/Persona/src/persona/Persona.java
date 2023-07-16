/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import Entidad.Persona1;
import java.util.Scanner;

public class Persona {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Persona1 persona2 = new Persona1();
        Persona1 persona3 = new Persona1();
        Persona1 persona4 = new Persona1();
        Persona1 persona5 = new Persona1();

        byte opcion;

        do {

            System.out.println("-------------------------------");
            System.out.println("Bienvenido");
            System.out.println("-------------------------------");
            System.out.println("1.Agregar usuario");
            System.out.println("2.Resumen de informacion de Usuario");
            System.out.println("3.Comprobar si la persona esta en buen peso");
            System.out.println("4.Verificar si es mayor de edad");
            System.out.println("5.Calcular porcentaje de peso");
            System.out.println("6.Salir");
            System.out.println("--------------------------------");
            opcion = leer.nextByte();

            switch (opcion) {

                case 1:
                    System.out.println("Ingresar datos de la persona");
                    System.out.print("1-Ingresar nombre de la persona:");
                    persona2.setNombre(leer.next());
                    System.out.print("2-Ingrese edad de la persona:");
                    persona2.setEdad(leer.nextInt());

                    System.out.print("3-Ingrese peso de la persona en kg:");
                    persona2.setPeso(leer.nextDouble());

                    System.out.print("4-Ingrese la altura de la persona(en metros):");
                    persona2.setAltura(leer.nextDouble());

                    System.out.print("5-Ingrese sexo de la persona(H,M,O):");
                    persona2.setSexo(leer.next().charAt(0));
                    persona2.setSaberSexo(leer.next());
                    System.out.println("  ----------------------- ");
                    break;

                case 2:
                    System.out.println("----------------------");
                    System.out.println(" Resumen de informacion de Usuario: ");
                    System.out.println(" Nombre: " + persona2.getNombre());
                    System.out.println(" Edad: " + persona2.getEdad());
                    System.out.println(" Peso: " + persona2.getPeso());
                    System.out.println(" Altura: " + persona2.getAltura());
                    System.out.println(" Sexo: " + persona2.getSaberSexo());
                    
                    System.out.println("----------------------");
                    break;

                case 3:
                    System.out.println(" 3-Ingrese peso de la persona en kg:");
                    persona2.setPeso(leer.nextDouble());
                    System.out.print("4-Ingrese la altura de la persona(en metros):");
                    persona2.setAltura(leer.nextDouble());
                    persona2.IMC();
                    persona2.calcularIMC();
                    System.out.println("Su IMC es: " + persona2.getIMC() + persona2.getCalcularIMC());
                    break;
                case 4:
                    System.out.print("2-Ingrese edad de la persona:");
                    persona2.setEdad(leer.nextInt());
                    persona2.esMayorDeEdad();
                    System.out.println(" Tiene: " + persona2.getEdad() + "años ");
                    persona2.getEsMayorDeEdad();

                case 5:
                    System.out.println("----------------------");

                    

            }

        } while (opcion != 5);

    }

}
