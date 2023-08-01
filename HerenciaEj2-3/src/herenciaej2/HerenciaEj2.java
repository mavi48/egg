package herenciaej2;

import HerenciaEntidades.Electrodomestico;
import HerenciaEntidades.Lavadora;
import HerenciaEntidades.Televisor;

public class HerenciaEj2 {

    private static Iterable<Electrodomestico> Televisor;

    public static void main(String[] args) {

        Electrodomestico listaE[] = new Electrodomestico[7];

        listaE[0] = new Electrodomestico(50d, "gris", 'B', 300d);
        listaE[1] = new Lavadora(30d, 100d, "blanco", 'C', 300d);
        listaE[3] = new Electrodomestico(500d, "gris", 'A', 1000d);
        listaE[4] = new Lavadora(300d, 160d, "azul", 'D', 60d);
        listaE[5] = new Televisor(50d, true, 30d, "rojo", 'F', 30d);
        listaE[6] = new Televisor(10d, true, 10d, "rojo", 'F', 100d);

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        for (int i = 0; i < listaE.length; i++) {

            if (listaE[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaE[i].precioFinal();
            }
            if (listaE[i] instanceof Lavadora) {
                sumaLavadoras += listaE[i].precioFinal();
            }
            if (listaE[i] instanceof Televisor) {
                sumaTelevisores += listaE[i].precioFinal();
            }
        }
        System.out.println("el total del precio de los electrodomesticos es de:" + sumaElectrodomesticos);
        System.out.println("el total del precio de las Lavadoras es de:" + sumaLavadoras);
        System.out.println("el total del precio de los Televisores es de:" + sumaTelevisores);
    }

}
//E Double precio, String color, char consumoEnergetico, Double peso
//L Double carga, Double precio, String color, char consumoEnergetico, Double peso
//T double resolucion, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso) {

