/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personita;

import Entidad.Datos;
import Servicio.ServicioPersonita;

import java.util.Date;
import java.util.Scanner;

public class Personita {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Date Fecha = new Date();

        ServicioPersonita sp = new ServicioPersonita();

        Datos D1 = sp.crearPersonita();

        sp.menorQue();
        System.out.println(D1.toString());
        sp.calcularEdad();

    }
}
