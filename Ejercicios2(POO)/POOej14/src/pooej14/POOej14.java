/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Codigo.Codigo;
import ServicioMovil.ServicioMovil;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOej14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Codigo cd = new Codigo();
        ServicioMovil sm = new ServicioMovil();

        sm.crearCelular(cd);
        sm.ingresarCodigo(cd);

    }
}
