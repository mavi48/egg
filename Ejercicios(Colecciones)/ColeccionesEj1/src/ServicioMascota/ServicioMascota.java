package ServicioMascota;

import EntidadMascota.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class ServicioMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<String> mascotas;

    public ServicioMascota() {

        this.mascotas = new ArrayList();

    }

    public void crearMascota(Mascota mas) {
        Scanner leer = new Scanner(System.in);

        boolean respuesta = true;
        while (respuesta) {

            System.out.println("Ingrese el tipo de raza:");
            String raza = leer.next();

            System.out.println("Ingrese el nombre:");
            String nombre = leer.next();

            String mascota = raza + " " + nombre;
            mascotas.add(mascota);

            System.out.println("quiere ingresar otra raza?(s/n)");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("n")) {
                respuesta = false;
            }

        }

    }

    public void mostrarMascotas(Mascota mas) {
        System.out.println("las razas con sus nombres actuales de la lista son:");

        for (String raza : mascotas) {
            System.out.println(raza);
        }
        System.out.println("cantidad = " + mascotas.size());
    }

    public void IterMasc() {

        System.out.println("Que raza busca?");
        String buscar = leer.nextLine();

        Iterator iterador = mascotas.iterator();
        mascotas.remove(buscar);
        System.out.println("el elemento no existe" + "(" + buscar + " )");

        boolean encontrado = true;

        Collections.sort(mascotas);

        if (encontrado) {
            System.out.println("ha sido eliminado");
        } else {
            System.out.println("no esta en la lista");
        }
        System.out.println("lista actualizada:");
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }

    }
}
