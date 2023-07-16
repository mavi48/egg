package relacionesej3;

import Entidad.Baraja;
import java.util.Scanner;

public class RelacionesEj3 {

    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        Scanner leer = new Scanner(System.in);

        baraja.mostrarBaraja();
        baraja.barajar();
        System.out.println("Las cartas barajadas son:");
        baraja.mostrarBaraja();
        baraja.cartasDisponibles();
        System.out.println("cuantas cartas voy a entregar:");
        int numero = leer.nextInt();
        baraja.darCartas(numero);
        baraja.cartasMonton();
        baraja.cartasDisponibles();
    }
}
