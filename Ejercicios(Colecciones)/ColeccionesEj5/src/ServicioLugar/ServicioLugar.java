package ServicioLugar;

import EntidadPais.Pais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

public class ServicioLugar {

    public List<Pais> listPaises;

    public ServicioLugar() {

        this.listPaises = new ArrayList<>();
        PaisesCargados();
    }
    Scanner leer = new Scanner(System.in);

    public void crearMundo(Pais lugar) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un pais :");
        String pais = leer.nextLine();

        Pais p = new Pais(pais);

        listPaises.add(p);

        System.out.println("quiere ingresar otra Pais? (s/n)");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            crearMundo(lugar);
        } else {
            System.out.println("siga participando");
            System.out.println("--------------------------------");
        }
    }

    public void PaisesCargados() {
        Pais p1 = new Pais("argentina");
        listPaises.add(p1);
        Pais p2 = new Pais("mexico");
        listPaises.add(p2);
        Pais p3 = new Pais("bolivia");
        listPaises.add(p3);
    }

    public void mostrar() {
        System.out.println("Lista de paises: ");
        for (Pais p : listPaises) {
            System.out.println(p);
        }
    }

    public void Paisordenado() {

        System.out.println("---------------------------------");
        System.out.println(" Paises ordenados : ");
        Collections.sort(listPaises, Comparator.comparing(Pais::getPais));
        mostrar();
    }

    public void eliminarPais() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del país a eliminar: ");
        String np = leer.nextLine();

        Pais paisAEliminar = null;
        for (Pais pais : listPaises) {
            if (pais.getPais().equalsIgnoreCase(np)) {
                paisAEliminar = pais;
                break;
            }
        }

        if (paisAEliminar != null) {
            listPaises.remove(paisAEliminar);
            System.out.println("El país '" + paisAEliminar + "' ha sido eliminado.");
        } else {
            System.out.println("El país '" + np + "' no se encuentra en la lista.");
        }

    }
}
