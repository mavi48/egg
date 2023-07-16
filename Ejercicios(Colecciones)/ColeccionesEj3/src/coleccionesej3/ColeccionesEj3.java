
package coleccionesej3;

import EntidadAlumno.Alumno;
import ServicioNotas.ServicioNotas;



public class ColeccionesEj3 {

  
    public static void main(String[] args) {
     
        ServicioNotas sn = new ServicioNotas();
        Alumno a = new Alumno();
        
  
    sn.crearAlumno();
    sn.notaFinal();
}
}

