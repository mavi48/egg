/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancia;

import Entidad.numeros;
import Servicio.Puntos;
import java.util.Scanner;

public class Distancia {
   Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        Puntos sp = new Puntos();
        numeros n = new numeros();

        sp.crearPuntos(n);
        
     
       
         System.out.println("las coordenadas son : " + n.getX() + "," + n.getY());
        
        numeros p = new numeros();
        p.setX(200);
        p.setY(200);
        System.out.println("las coordenadas son : " + p.getX()+ "," + p.getY());
        
        System.out.println("la distancia es: " + n.calcularDistancia(p));
    }

}
