/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad1.Libros;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Libros primerLibro = new Libros();
     Scanner leer =new Scanner(System.in);
     
     System.out.println("Ingrese el ISBN del libro");
     primerLibro.setISBN (leer.nextInt()); 
     System.out.println("Ingrese el titulo del libro");
     primerLibro.setTitulo(leer.next());
     System.out.println("Ingrese el Autor del libro");
     primerLibro.setAutor(leer.next());
     System.out.println("Ingrese el numero de paginas del libro");
     primerLibro.setNumeroPaginas(leer.nextInt());
     System.out.println("El Autor es:" + primerLibro.getAutor() + " ,el titulo es: " + primerLibro.getTitulo() + " ,su ISBN es: " + primerLibro.getISBN() + " y tiene: " + primerLibro.getNumeroPaginas() + " paginas.");
    } 
}
    

