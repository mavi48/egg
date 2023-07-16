/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPeliculas;

import EntidadPelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

public class ServicioPeliculas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<Pelicula> listaPeli;

    public ServicioPeliculas() {
        listaPeli = new ArrayList<>();
    }

    public void crearPelicula(Pelicula cine) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el director de la pelicula:");
        String director = leer.nextLine();
        System.out.println("cuanto dura la pelicula:");
        double horas = leer.nextDouble();

        Pelicula p = new Pelicula(titulo, director, horas);
        listaPeli.add(p);

        System.out.println("quiere ingresar otra pelicula? (s/n)");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            crearPelicula(cine);
        } else {
            System.out.println("siga participando");
        }
    }

    public void peliculasCargadas() {
        Pelicula pelicula1 = new Pelicula("zurasic", "Steven", 2);
        listaPeli.add(pelicula1);
        Pelicula pelicula2 = new Pelicula("La momia", "Brendan", 1);
        listaPeli.add(pelicula2);
        Pelicula pelicula3 = new Pelicula("La vida es bella", "Italiano", 3);
        listaPeli.add(pelicula3);
        Pelicula pelicula4 = new Pelicula("Titanic", "Leo", 20);
        listaPeli.add(pelicula4);

    }

    public void MayorUnaHora() {
        System.out.println("---------------------------------------");
        System.out.println("Las Peliculas Mayores a 2 horas son: ");
        for (Pelicula pelicula : listaPeli) {
            if (pelicula.getHoras() > 2.0) {
                System.out.println(pelicula);
            }
        }
    }
      public void ordenadoTitulo(){
        System.out.println("---------------------------------------");
        System.out.println("Las Peliculas ordenadas por titulo son: ");
                Collections.sort(listaPeli, Comparator.comparing(Pelicula::getTitulo));
                mostrarPelicula();
        }
    
      public void ordenadoDirector(){
        System.out.println("---------------------------------------");
        System.out.println("Las Peliculas ordenadas por Director son: ");
        Collections.sort(listaPeli, Comparator.comparing(Pelicula::getDirector));
        mostrarPelicula();
    }
      
       public void MayorDuracion() {
               // Collections.sort(peliculaList, Comparator.comparing(Pelicula::getDuracion).reversed());
        Pelicula[] peliculaArray =listaPeli.toArray(new Pelicula[0]);
        for (int i = 0; i< listaPeli.size(); i++){
            for(int j = 0; j< listaPeli.size(); j++){
                if(peliculaArray[j].getHoras() < peliculaArray[i].getHoras()){
                    Pelicula tiempo = peliculaArray[i];
                    peliculaArray[i] = peliculaArray[j];
                    peliculaArray[j] = tiempo;
                }
            }
        }  
           System.out.println("-----------------------------------------------");
        System.out.println(" Las peliculas ordenas de mayor a menor son: ");
        for (Pelicula pel : peliculaArray) {
            System.out.println(pel);

        }
    }
      
       public void MenorDuracion() {
               // Collections.sort(peliculaList, Comparator.comparing(Pelicula::getDuracion));
                    Pelicula[] peliculaArray =listaPeli.toArray(new Pelicula[0]);
                    for (int i = 0; i< listaPeli.size(); i++){
                        for(int j = 0; j< listaPeli.size(); j++){
                            if(peliculaArray[j].getHoras() > peliculaArray[i].getHoras()){
                                Pelicula tiempo = peliculaArray[i];
                                peliculaArray[i] = peliculaArray[j];
                                peliculaArray[j] = tiempo;
                            }
                        }
                    }
             System.out.println("--------------------------------------------------------");
                    System.out.println(" Las peliculas ordenas de menor a mayor son: ");
                    for (Pelicula pel : peliculaArray) {
                        System.out.println(pel);
                    }
    }
      
    
    
    
    

    public void mostrarPelicula() {
           System.out.println("-----------------------");
        System.out.println("Lista de peliculas:");
        for (Pelicula peli : listaPeli) {
            System.out.println(peli);
        }
    }
}
