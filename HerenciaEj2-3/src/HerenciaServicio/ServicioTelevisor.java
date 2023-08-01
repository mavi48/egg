package HerenciaServicio;

import HerenciaEntidades.Electrodomestico;




public class ServicioTelevisor extends Electrodomestico{
    
    public ServicioTelevisor(Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
    }
    
}