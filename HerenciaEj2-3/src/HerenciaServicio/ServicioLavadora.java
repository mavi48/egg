
package HerenciaServicio;

import HerenciaEntidades.Electrodomestico;




public class ServicioLavadora extends Electrodomestico{

    public ServicioLavadora(Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
    }

  
}  

    




/*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/