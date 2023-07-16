/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta num1 = new Cuenta();
     
        
        byte opcion = 0;
        do {

            System.out.println("-------------------------------");
            System.out.println("Bienvenido al Banco de los Ricos");
            System.out.println("-------------------------------");
            System.out.println("Elija una opcion del Menu");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Realizar deposito a cuenta ");
            System.out.println("3. Realizar retiro ");
            System.out.println("4. Realizar retiro rapido ");
            System.out.println("5. Consultar saldo ");
            System.out.println("6. Consultar informacion de la cuenta");
            System.out.println("7. Salir");
            System.out.println("--------------------------------");
            opcion = leer.nextByte();

            switch (opcion) {

                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese el numero de cuenta: ");
                    num1.setNumeroCuenta(leer.nextInt());
                    System.out.print("Ingrese el DNI: ");
                    num1.setDNI(leer.nextInt());
                    System.out.print("Ingrese el saldo actual de la cuenta " + num1.getNumeroCuenta() + " :");
                    num1.setSaldoActual(leer.nextInt());
                    System.out.println("--------------------------------------------");
                    break;

                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("Ingrese el monto que desea depositar: ");
                    num1.setDepositar(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + num1.depositar());
                    num1.setSaldoActual((int) num1.depositar());
                    System.out.println("---------------------------------------------");
                    break;

                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println("Ingrese el monto que desea retirar: ");
                    num1.setRetiro(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + num1.retirar());
                    num1.setSaldoActual((int) num1.retirar());
                    System.out.println("---------------------------------------------");
                    break;

                case 4:
                    System.out.println("-------------------------------------------");
                    System.out.println("Usted selecciono retiro rapido ");
                    System.out.println("El monto correspondiente al 20% es: " + num1.retiroRapido());
                    num1.setSaldoActual((int) num1.retiroRapido());
                    System.out.println("---------------------------------------------");
                    break;

                case 5:
                    System.out.println("---------------------------------------------");
                    System.out.println("Su saldo actual es: " + num1.getSaldoActual());
                    System.out.println("---------------------------------------------");
                    break;

                case 6:
                    System.out.println("---------------------------------------------");
                    System.out.println("Resumen de la cuenta: ");
                    System.out.println("Numero de cuenta: " + num1.getNumeroCuenta());
                    System.out.println("Numero de DNI: " + num1.getDNI());
                    System.out.println("Saldo actual: " + num1.getSaldoActual());
                    System.out.println("---------------------------------------------");
                    break;
            }
        } while (opcion != 7);

    }
}
