package coleccionesej6;

import EntidadTienda.Tienda;
import ServicioProducto.ServicioProducto;
import java.util.HashMap;
import java.util.Scanner;

public class ColeccionesEj6 {

    public static void main(String[] args) {

        ServicioProducto sp = new ServicioProducto();
        Tienda tienda = new Tienda();

        HashMap<String, Integer> listaProducto = new HashMap<>();
        Scanner leer = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("-------------------------------");
            System.out.println("Bienvenido");
            System.out.println("-------------------------------");
            System.out.println("Elija una opcion del Menu");
            System.out.println("1. Agregar stock de un producto");
            System.out.println("2. Modificar precio del producto");
            System.out.println("3. Mostrar productos ");
            System.out.println("4.Eliminar producto");
            System.out.println("5. Salir");
            System.out.println("--------------------------------");
            opcion = leer.nextByte();

            switch (opcion) {

                case 1:

                    String nombreProducto = null;
                    sp.agregarProducto(opcion, nombreProducto, listaProducto);

                    break;
                case 2:
                    nombreProducto = null;
                    sp.modificarPrecio(opcion, nombreProducto, listaProducto);

                    break;
                case 3:
                    sp.mostrarProductos(listaProducto);
                   
                    break;
                case 4:
                     nombreProducto = null;
                    sp.eliminarProducto(nombreProducto, listaProducto);
                    
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion del 1 al 5");
            }
        }
    }
}
