package Servicio;

import Alumnos.estudiantes;
import java.util.Scanner;

public class chicos {
    
    public void crearCurso(estudiantes chicos) {
        
        Scanner leer = new Scanner(System.in);
       
            
            System.out.println("Ingrese el numero de alumno : ");
            int cantidadAlumnos = leer.nextInt();
            chicos.setCantidadAlumnos(cantidadAlumnos);
            
            System.out.println("Ingrese nombre del Curso:");
            String nombreCurso = leer.next();
            chicos.setNombreCurso(nombreCurso);
            
            System.out.println("Ingrese la  cantidadHorasPorDia:");
            int cantidadHorasPorDia = leer.nextInt();
            chicos.setCantidadHorasPorDia(cantidadHorasPorDia);
            
            System.out.println("Ingrese la cantidadDiasPorSemana:");
            int cantidadDiasPorSemana = leer.nextInt();
            chicos.setCantidadDiasPorSemana(cantidadDiasPorSemana);
            
            System.out.println("Ingrese el  precioPorHora :");
            int precioPorHora = leer.nextInt();
            chicos.setPrecioPorHora(precioPorHora);
            
            System.out.print("Ingrese su turno:");
            String turno = leer.next();
            chicos.setTurno(turno);
            
             System.out.println(chicos.toString());
            //
            //System.out.println("la ganancia total es: " + ganancia2 );
        }
    
    
    public void calcularGananciaSemanal(estudiantes chicos) {
        
        int ganancia1 = chicos.getCantidadDiasPorSemana() * chicos.getCantidadHorasPorDia();
        int ganancia2 = ganancia1 * chicos.getCantidadAlumnos();
        int ganancia = ganancia2 * chicos.getPrecioPorHora();

        System.out.println(chicos.getGanancia());
    }
    
}
