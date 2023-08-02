package herenciaej4;

import Entidad.Circulo;
import Entidad.Rectangulo;
import java.util.Scanner;

public class HerenciaEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Circulo c1 = new Circulo();

        System.out.println("Ingrese el radio del circulo:");
        c1.setRadio(leer.nextDouble());
        System.out.println("el Radio es : " + c1.getRadio());
        System.out.println("el Area del circulo es:" + c1.Area());

        c1.Perimetro(2);

        Rectangulo rec = new Rectangulo();

        rec.Area(2.3, 6);
        rec.Perimetro(5.9, 4.2);

    }

}
