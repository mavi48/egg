package Entidad;


import java.util.ArrayList;
import java.util.Collections;


public class Baraja {

    public ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();

        String[] tiposPalo = {"espada", "basto", "oro", "copas"};
        int[] numeroCarta = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String palo : tiposPalo) {
            for (int numero : numeroCarta) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

    public void barajar() {

        Collections.shuffle(cartas);
    }

    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son:" + cartas.size());

    }

    public Carta siguienteCarta() {

        if (cartas.isEmpty()) {
            System.out.println("No hay cartas");
            return null;
        } else {
            //System.out.println("Aun hay cartas");
            Carta cartaSiguiente = cartas.remove(0);

            return cartaSiguiente;
        }

    }

    public void mostrarBaraja() {

        for (Carta carta : cartas) {
            System.out.println(carta.toString());
        }
    }

    public void darCartas(int numero) {

        if (numero > cartas.size()) {
            System.out.println("No se puede dar mas cartas");

        } else {
            ArrayList<Carta> maso = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                Carta siguiente = siguienteCarta();
                if (siguiente != null) {
                    maso.add(siguiente);
                }
            }
            System.out.println("Las cartas del maso son:");
            for (Carta aux : maso) {
                System.out.println(aux);
            }

        }

    }

    public void cartasMonton() {

        ArrayList<Carta> monton = new ArrayList<>();
        if (monton.isEmpty()) {
            System.out.println("El monton esta vacio");
        }
    }
}
