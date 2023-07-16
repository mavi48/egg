/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioMovil;

import Codigo.Codigo;
import java.util.Scanner;

public class ServicioMovil {

    Scanner leer = new Scanner(System.in);

    public void crearCelular(Codigo codigo) {

        System.out.println("Ingrese marca:");
        codigo.setMarca(leer.nextLine());

        System.out.println("Ingrese precio:");
        codigo.setPrecio(leer.nextInt());

        System.out.println("Ingrese memoria Ram:");
        codigo.setMemoriaRam(leer.nextInt());

        System.out.println("Ingrese almacenamiento:");
        codigo.setAlmacenamiento(leer.nextInt());

        System.out.println("Ingrese codigo:");
        codigo.setCodigo1(leer.nextInt());

        System.out.println("Ingrese modelo:");
        codigo.setModelo(leer.next());

        System.out.println(codigo.toString());

    }

    public void ingresarCodigo(Codigo codigo) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los 7 digitos:");
        codigo.setCodigo1(leer.nextInt());
        System.out.print("el codigo de 7 digitos es: " + codigo.getCodigo1());
    }
}
