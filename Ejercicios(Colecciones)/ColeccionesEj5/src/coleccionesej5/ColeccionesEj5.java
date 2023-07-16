package coleccionesej5;

import EntidadPais.Pais;
import ServicioLugar.ServicioLugar;


public class ColeccionesEj5 {

    public static void main(String[] args) {

        ServicioLugar sl = new ServicioLugar();
        Pais p = new Pais();
      
     
       //sl.crearMundo(p);
       //sl.PaisesCargados();
       sl.mostrar();
       sl.Paisordenado();
       sl.eliminarPais();
       sl.mostrar();
    }
}
