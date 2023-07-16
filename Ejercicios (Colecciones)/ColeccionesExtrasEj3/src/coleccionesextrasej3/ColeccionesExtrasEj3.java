package coleccionesextrasej3;

import EntidadLibro.EntidadLibro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ColeccionesExtrasEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        HashSet<String> libros3 = new HashSet();
        //HashSet<Integer> libros2 = new HashSet();

        //EntidadLibro el = new EntidadLibro ();
        EntidadLibro libros1 = new EntidadLibro("el quijote", "Cervantes", 1, 0);
        EntidadLibro libros2 = new EntidadLibro();

        System.out.println("Ingrese titulo del Libro:");
        String titulo = leer.nextLine();

        System.out.println("Ingrese el autor del Libro:");
        String autor = leer.nextLine();

        System.out.println("Ingrese el numero de ejemplares:");
        Integer numeroEjemplares = leer.nextInt();

        System.out.println("Ingrese el numero de ejemplares prestados:");
        Integer numeroEjPrestados = leer.nextInt();

        libros2.setTitulo(titulo);
        libros2.setAutor(autor);
        libros2.setNumeroEjemplares(numeroEjemplares);
        libros2.setNumeroEjPrestados(numeroEjPrestados);
        
        System.out.println("libro 2 :" + libros2.toString());
        System.out.println("libro 1 :" + libros1.toString());

        /*System.out.println("Libro 1:");
        System.out.println("Titulo: " + libros1.getTitulo());
        System.out.println("Autor: " + libros1.getAutor());
        System.out.println("Ejemplares: " + libros1.getNumeroEjemplares());
        System.out.println("Prestados: " + libros1.getNumeroEjPrestados());
        System.out.println();*/

        System.out.println("Ingrese el titulo del libro que quiere prestar: ");
        titulo = leer.next();
        libros3.add(titulo);

        if (libros3) {
            System.out.println("Se ha prestado el libro " + libros2.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libros2.getTitulo() + " para prestar");
        }
        if (libros2.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libros2.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libros2.getTitulo() + " prestados");
        }

        if (libros1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libros1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libros1.getTitulo() + " prestados");
        }

        if (libros1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libros1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libros1.getTitulo() + " para prestar");
        }

        //mostrar
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libros1.toString());
        System.out.println();

        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libros2.toString());

    }
}

/*  

      

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();*/
