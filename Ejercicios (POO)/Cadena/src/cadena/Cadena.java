/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import Entidad.Frase;
import cadena.servicios.ServicioCadena;

import java.util.Scanner;

public class Cadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Frase Letra = new Frase();
        
        ServicioCadena sc = new ServicioCadena();
       
        
        System.out.println("Ingrese la frase");
        Letra.setFrase(leer.nextLine());
        System.out.println("la frase ingresada es:" + Letra.getFrase());
        System.out.println("la longitud de la frase es:" + Letra.getLongitud());
        System.out.println(" las vocales son " + sc.mostrarvocales(Letra));
        System.out.println("Cadena original: " + Letra.getFrase() );
        System.out.println("Cadena invertida: " + sc.invertirFrase(Letra));
        System.out.print("Ingrese una letra para contar repeticiones:");
        String caracter = leer.nextLine();
        
        System.out.println("la letra " + caracter + " se repite " + sc.vecesRepetido(caracter, Letra) + " veces.");
        System.out.println("Ingrese una frase para comparar su longitud: ");
        String nuevaFrase = leer.nextLine();
        sc.compararLongitud(nuevaFrase, Letra);
        sc.unirFrase(nuevaFrase, Letra);
        sc.reemplazo(caracter, Letra);
        sc.contiene(caracter, Letra);
        if (sc.contiene(caracter, Letra)== true ) {
            
       System.out.println("La frase contiene la letra " + caracter);
        }else{
            System.out.println("La frase no contiene la letra " + caracter);
        }
}
        
}


