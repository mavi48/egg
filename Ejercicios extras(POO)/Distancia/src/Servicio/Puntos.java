package Servicio;

import Entidad.numeros;
import java.util.Scanner;

public class Puntos {

    Scanner leer = new Scanner(System.in);

    public void crearPuntos(numeros num) {
        System.out.println("Ingrese dos numero: ");
        int x = leer.nextInt();
        num.setX(x);
        int y= leer.nextInt();
        num.setY(y);

        
    }


}
