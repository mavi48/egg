/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Nif;
import java.util.Scanner;

public class ServicioDni {

    Scanner leer = new Scanner(System.in);

    public void crearNif(Nif nif) {

        System.out.println("Ingrese su Dni:");
        int Dni = leer.nextInt();
        nif.setDni(Dni);
        int codigo = Dni % 23;
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'E', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'X', 'V', 'H', 'L', 'C', 'K', 'E'};
        nif.setLetra(letra[codigo]);
    }

    public void mostrar(Nif nif) {
      
    System.out.println("su Dni es: " + nif.getDni() +  " letra " + nif.getLetra());  
    
    }

}
