package ServicioProducto;

import EntidadTienda.Tienda;
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Scanner;

import static java.util.Spliterators.iterator;

public class ServicioProducto {

    Scanner leer = new Scanner(System.in);

    HashMap<String, Integer> listaProducto = new HashMap<>();

    public ServicioProducto() {
    }

    public void agregarProducto(double valorPrecio, String nombreProducto, HashMap<String, Integer> listaProducto) {

        System.out.println("Ingrese el nombre del producto :");
        nombreProducto = leer.next();
        System.out.println("Ingrese el precio el producto:");
        valorPrecio = leer.nextDouble();
        if (listaProducto.containsKey(valorPrecio)) {
            System.out.println("ya existe");
        } else {
            listaProducto.put(nombreProducto, 1);
            System.out.println("se agrego el producto");
        }
    }

    public void modificarPrecio(double valorPrecio, String nombreProducto, HashMap<String, Integer> listaProducto) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre al que le quieres modificar el precio:");
        nombreProducto = leer.nextLine();

        System.out.println("Ingrese el precio del producto");
        valorPrecio = leer.nextDouble();

        if (listaProducto.containsKey(nombreProducto)) {
            listaProducto.put(nombreProducto, Integer.SIZE);
            System.out.println("se modifico el precio");
        } else {
            System.out.println("no hay ningun producto con ese valor");
        }
    }

    public void mostrarProductos( HashMap<String, Integer> listaProducto) {

        Iterator<String> productos = listaProducto.keySet().iterator();
        System.out.println("hay estos productos:");
        while (productos.hasNext()) {
          String nombreProducto = productos.next();
           
          
            System.out.println(nombreProducto + listaProducto.get(nombreProducto) );
               
     
        }
        }

    

    public void eliminarProducto(String nombreProducto, HashMap<String, Integer> listaProducto) {
        System.out.println("Ingrese el nombre del producto que quiere eliminar:");
        nombreProducto = leer.next();
     
         
         if(listaProducto.containsKey(nombreProducto)){
              listaProducto.remove(nombreProducto);
              System.out.println("el producto fue eliminado");
          }else{
              System.out.println("no hay producto con ese codigo");
          }
    }
}
